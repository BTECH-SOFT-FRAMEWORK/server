package com.btsoft.framework.commoncode.entity;

import com.btsoft.framework.common.entity.BaseEntity;
import com.btsoft.framework.company.entity.Company;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@Getter
@Table(name = "BC_COMM_H")
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

    protected CommonCodeGroup() {
        super();
    }
}
