package com.library.management.repository;

import com.library.management.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    Optional<Member> findByLastName(String lastName);
    Optional<Member> findByFullName(String firstName, String lastName);
    Optional<Member> findByEmail(String email);
}
