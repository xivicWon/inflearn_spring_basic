package com.inflearn.basic.member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);

}
