package com.btsoft.framework.company.entity;

import com.btsoft.framework.common.entity.Address;
import com.btsoft.framework.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "BC_COMPANY")
@Getter
@SuperBuilder
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

    protected Company() {
        super();
    }
}
