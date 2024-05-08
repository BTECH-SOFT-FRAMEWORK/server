package com.btsoft.framework.common.entity;

import com.btsoft.framework.company.entity.Company;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "BC_FILE")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Attachment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BC_FILE_ID")
    private Long id;

    @Column(name = "SRC_FILE_NM")
    private String originalFileName;

    @Column(name = "NEW_FILE_NM")
    private String savedFileName;

    @Column(name = "FILE_SEQ")
    private Long priority;

    @Column(name = "FILE_SIZE")
    private Long fileSize;

    @Column(name = "PATH")
    private String path;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_ID")
    private Attachment parent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BC_COMPANY_ID")
    private Company company;

    @Builder
    private Attachment(String originalFileName, String savedFileName, Long priority, Long fileSize, String path, Attachment parent, Company company) {
        this.originalFileName = originalFileName;
        this.savedFileName = savedFileName;
        this.priority = priority;
        this.fileSize = fileSize;
        this.path = path;
        this.parent = parent;
        this.company = company;
    }
}
