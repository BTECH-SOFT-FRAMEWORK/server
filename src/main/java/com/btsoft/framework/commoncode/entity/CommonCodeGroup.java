package com.btsoft.framework.commoncode.entity;

import com.btsoft.framework.common.entity.BaseEntity;
import com.btsoft.framework.company.entity.Company;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "BC_COMM_H")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommonCodeGroup extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BC_COMM_H_ID")
    private Long id;

    @Column(name = "HEAD_CD")
    private Long code;

    @Column(name = "HEAD_NM")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BC_COMPANY_ID")
    private Company company;

    @Builder
    private CommonCodeGroup(Long code, String name, Company company) {
        this.code = code;
        this.name = name;
        this.company = company;
    }
}
