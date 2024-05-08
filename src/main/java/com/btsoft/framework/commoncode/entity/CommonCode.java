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
@Table(name = "BC_COMM_L")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommonCode extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BC_COMM_L_ID")
    private Long id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "CODE_NM")
    private String name;

    @Column(name = "COUNTRY_CD")
    private String countryCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HEAD_CD")
    private CommonCodeGroup commonCodeGroup;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BC_COMPANY_ID")
    private Company company;

    @Builder
    private CommonCode(String code, String name, String countryCode, CommonCodeGroup commonCodeGroup, Company company) {
        this.code = code;
        this.name = name;
        this.countryCode = countryCode;
        this.commonCodeGroup = commonCodeGroup;
        this.company = company;
    }
}
