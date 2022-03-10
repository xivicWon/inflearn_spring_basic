package com.inflearn.basic.discount;

import com.inflearn.basic.member.Grade;
import com.inflearn.basic.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RateDicountPolicyTest {

    RateDicountPolicy rateDicountPolicy = new RateDicountPolicy();

    @Test
    @DisplayName("VIP 는 10% 할인된 금액으로 계산한다.")
    void vip_o(){
        //Given
        Member member = new Member(1L  , "memberA" , Grade.VIP);

        //When
        int discount = rateDicountPolicy.discount(member, 10000);

        //Then
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("BASIC은 0% 할인된 금액으로 계산한다.")
    void vip_x(){
        //Given
        Member member = new Member(2L  , "memberA" , Grade.BASIC);

        //When
        int discount = rateDicountPolicy.discount(member, 10000);

        //Then
        assertThat(discount).isEqualTo(0);
    }


}