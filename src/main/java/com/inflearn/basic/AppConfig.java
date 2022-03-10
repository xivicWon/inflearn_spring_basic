package com.inflearn.basic;

import com.inflearn.basic.discount.DiscountPolicy;
import com.inflearn.basic.discount.FixDiscountPolicy;
import com.inflearn.basic.discount.RateDicountPolicy;
import com.inflearn.basic.member.MemberRepository;
import com.inflearn.basic.member.MemberService;
import com.inflearn.basic.member.MemberServiceImpl;
import com.inflearn.basic.member.MemoryMemberRepository;
import com.inflearn.basic.order.OrderService;
import com.inflearn.basic.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    private MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDicountPolicy();
    }

}
