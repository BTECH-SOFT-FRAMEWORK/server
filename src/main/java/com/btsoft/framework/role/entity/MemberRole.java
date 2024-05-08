package com.btsoft.framework.role.entity;

import com.btsoft.framework.common.entity.BaseEntity;
import com.btsoft.framework.company.entity.Company;
import com.btsoft.framework.member.entity.Member;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "SY_POLICY_U")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberRole extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SY_POLICY_U_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SY_POLICY_H_ID")
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BC_COMPANY_ID")
    private Company company;

    @Builder
    private MemberRole(Member member, Role role, Company company) {
        this.member = member;
        this.role = role;
        this.company = company;
    }
}
