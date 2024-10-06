package com.library.management.repository;

import com.library.management.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    List<Member> findMemberByLastName(String lastName);
    Optional<Member> findMemberByFirstNameAndLastName(String firstName, String lastName);
    Optional<Member> findByEmail(String email);
}
