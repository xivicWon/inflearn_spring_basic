package com.inflearn.basic.order;

import com.inflearn.basic.AppConfig;
import com.inflearn.basic.member.Grade;
import com.inflearn.basic.member.Member;
import com.inflearn.basic.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class OrderServiceTest {

    MemberService memberService;
    OrderService orderService ;

    @BeforeEach
    public void beforeEach( ){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder() {

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA" , Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA" , 9999);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}