package com.inflearn.basic.discount;

import com.inflearn.basic.member.Grade;
import com.inflearn.basic.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mainDiscountPolicy")
public class RateDicountPolicy implements DiscountPolicy{

    private final int discountPercent = 10 ;
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
