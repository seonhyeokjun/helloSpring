package com.hello.hellospring.repository;


import com.hello.hellospring.domain.Member;

import java.util.*;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();

}
