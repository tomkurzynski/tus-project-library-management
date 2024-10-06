package com.library.management.service;

import com.library.management.entity.Member;

import java.util.List;

public interface MemberServiceInterface {
    Member getMemberById(int memberId);
    Member getMemberByEmail(String email);
    Member findMemberByFirstNameAndLastName(String firstName, String lastName);
    List<Member> getMemberBySurname(String surname);
    List<Member> getAllMembers();
    Member createMember(Member member);
    Member updateMember(Member member);
    void deleteMember(Member member);
}
