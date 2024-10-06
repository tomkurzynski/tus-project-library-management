package com.library.management.service;

import com.library.management.entity.Member;
import com.library.management.exception.MemberNotFoundException;
import com.library.management.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberService implements MemberServiceInterface{

    @Autowired
    MemberRepository memberRepository;

    @Override
    public Member getMemberById(int memberId) {
        return memberRepository.findById(memberId)
                .orElseThrow(() -> new MemberNotFoundException("Member with Id " + memberId + " not found"));
    }

    @Override
    public Member getMemberByEmail(String email) {
        return memberRepository.findByEmail(email)
                .orElseThrow(() -> new MemberNotFoundException("Member cannot be found: " + email));
    }

    @Override
    public Member findMemberByFirstNameAndLastName(String firstName, String lastName) {
        return memberRepository.findMemberByFirstNameAndLastName(firstName, lastName)
                .orElseThrow(() -> new MemberNotFoundException("Member " + firstName + " " + lastName + " cannot be found" ));
    }

    @Override
    public List<Member> getMemberBySurname(String surname) {
        return memberRepository.findMemberByLastName(surname);
    }

    @Override
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    @Override
    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member updateMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public void deleteMember(Member member) {
        memberRepository.delete(member);
    }
}
