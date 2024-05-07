package com.btsoft.framework.role.repository;

import com.btsoft.framework.role.entity.MemberRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRoleRepository extends JpaRepository<MemberRole, Long> {
}
