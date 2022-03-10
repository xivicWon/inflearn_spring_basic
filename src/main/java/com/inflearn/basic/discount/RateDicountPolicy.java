package com.inflearn.basic.discount;

import com.inflearn.basic.member.Grade;
import com.inflearn.basic.member.Member;

public class RateDicountPolicy implements DiscountPolicy{

    private int discountPercent = 10 ;
    @Override
    public int discount(Member member, int price) {
        if( member.getGrade() == Grade.VIP)
        {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
