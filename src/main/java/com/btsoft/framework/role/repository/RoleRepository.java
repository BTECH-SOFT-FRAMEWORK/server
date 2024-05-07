package com.btsoft.framework.role.repository;

import com.btsoft.framework.role.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
