package com.inflearn.basic.discount;


import com.inflearn.basic.member.Grade;
import com.inflearn.basic.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("fixDiscountPolicy")
@Primary
public class FixDiscountPolicy implements DiscountPolicy{
    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {

        if( member.getGrade() == Grade.VIP){
            return discountFixAmount;
        } else {
            return 0;
        }

    }
}
