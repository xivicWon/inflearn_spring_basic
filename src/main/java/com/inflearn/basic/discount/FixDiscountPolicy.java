package com.inflearn.basic.discount;


import com.inflearn.basic.member.Grade;
import com.inflearn.basic.member.Member;

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
