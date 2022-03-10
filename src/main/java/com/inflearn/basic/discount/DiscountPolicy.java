package com.inflearn.basic.discount;

import com.inflearn.basic.member.Member;

public interface DiscountPolicy {

    int discount(Member member , int price);

}
