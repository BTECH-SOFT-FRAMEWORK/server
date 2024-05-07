package com.btsoft.framework.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Address {

    @Column(name = "ADDR_BASE")
    private String address;

    @Column(name = "ADDR_DETAIL")
    private String detailAddress;

    @Column(name = "ZIP_CD")
    private String zipcode;

    @Column(name = "ADDR_EXTRA")
    private String extraAddress;

    @Column(name = "TYPE")
    private String type;

    @Builder
    public Address(String address, String detailAddress, String zipcode, String extraAddress, String type) {
        this.address = address;
        this.detailAddress = detailAddress;
        this.zipcode = zipcode;
        this.extraAddress = extraAddress;
        this.type = type;
    }
}
