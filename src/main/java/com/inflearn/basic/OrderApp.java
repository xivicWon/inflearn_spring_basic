package com.inflearn.basic;

import com.inflearn.basic.member.Grade;
import com.inflearn.basic.member.Member;
import com.inflearn.basic.member.MemberService;
import com.inflearn.basic.order.Order;
import com.inflearn.basic.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args){

//        AppConfig appConfig =new AppConfig();
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        OrderService orderService = ac.getBean("orderService", OrderService.class);

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA" , Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA" , 20000);
        System.out.println("order = " + order);
    }
}
