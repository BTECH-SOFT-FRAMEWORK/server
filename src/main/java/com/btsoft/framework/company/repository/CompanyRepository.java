package com.btsoft.framework.company.repository;

import com.btsoft.framework.company.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
