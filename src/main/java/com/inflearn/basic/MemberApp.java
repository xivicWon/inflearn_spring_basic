package com.inflearn.basic;

import com.inflearn.basic.member.Grade;
import com.inflearn.basic.member.Member;
import com.inflearn.basic.member.MemberService;

public class MemberApp {


    public static void main(String[] args){
        AppConfig appConfig =new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());

    }
}
