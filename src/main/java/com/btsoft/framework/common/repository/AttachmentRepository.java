package com.btsoft.framework.common.repository;

import com.btsoft.framework.common.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
