package com.btsoft.framework.member.repository;

import com.btsoft.framework.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
}
