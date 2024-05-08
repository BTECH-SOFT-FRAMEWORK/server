package com.btsoft.framework.member.entity;

import com.btsoft.framework.common.entity.Address;
import com.btsoft.framework.common.entity.Attachment;
import com.btsoft.framework.common.entity.BaseEntity;
import com.btsoft.framework.company.entity.Company;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "BC_USER")
public class Member extends BaseEntity {

    @Id
    @Column(name = "USER_ID")
    private String username;

    @Column(name = "PW_CURR")
    private String password;

    @Column(name = "NAME_1ST")
    private String firstName;

    @Column(name = "NAME_2ST")
    private String lastName;

    @Embedded
    private Address address;

    @Column(name = "COUNTRY_CD")
    private String countryCode;

    @Column(name = "E_MAIL")
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BC_FILE_ID")
    private Attachment attachment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BC_COMPANY_ID")
    private Company company;

    @Builder
    private Member(String username, String password, String firstName,
                   String lastName, Address address, String countryCode, String email,
                   Attachment attachment, Company company) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.countryCode = countryCode;
        this.email = email;
        this.attachment = attachment;
        this.company = company;
    }


}
