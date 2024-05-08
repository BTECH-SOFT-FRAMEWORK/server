package com.btsoft.framework.company.entity;

import com.btsoft.framework.common.entity.Address;
import com.btsoft.framework.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BC_COMPANY")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Company extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BC_COMPANY_ID")
    private Long id;

    @Column(name = "COMP_CD")
    private Long code;

    @Column(name = "COMP_NM")
    private String name;

    @Column(name = "BIZREG_NO")
    private String businessNumber;

    @Column(name = "REPR_NM")
    private String repDirectorName;

    @Embedded
    private Address address;

    @Builder
    private Company(Long code, String name, String businessNumber, String repDirectorName, Address address) {
        this.code = code;
        this.name = name;
        this.businessNumber = businessNumber;
        this.repDirectorName = repDirectorName;
        this.address = address;
    }
}
