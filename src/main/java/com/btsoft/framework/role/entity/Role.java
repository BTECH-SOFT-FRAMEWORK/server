package com.btsoft.framework.role.entity;

import com.btsoft.framework.common.entity.BaseEntity;
import com.btsoft.framework.company.entity.Company;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "SY_POLICY_H")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Role extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SY_POLICY_H_ID")
    private Long id;

    @Column(name = "POLICY_CD")
    private String code;

    @Column(name = "POLICY_NM")
    private String name;

    @Column(name = "POLICY_DSC")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BC_COMPANY_ID")
    private Company company;

    @Builder
    private Role(String code, String name, String description, Company company) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.company = company;
    }
}
