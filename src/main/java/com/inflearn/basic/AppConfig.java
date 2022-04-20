package com.inflearn.basic;

import com.inflearn.basic.discount.DiscountPolicy;
import com.inflearn.basic.discount.RateDicountPolicy;
import com.inflearn.basic.member.MemberRepository;
import com.inflearn.basic.member.MemberService;
import com.inflearn.basic.member.MemberServiceImpl;
import com.inflearn.basic.member.MemoryMemberRepository;
import com.inflearn.basic.order.OrderService;
import com.inflearn.basic.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDicountPolicy();
    }

}
