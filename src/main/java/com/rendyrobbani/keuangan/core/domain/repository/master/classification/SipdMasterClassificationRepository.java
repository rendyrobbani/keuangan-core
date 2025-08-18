package com.rendyrobbani.keuangan.core.domain.repository.master.classification;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.SipdMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.repository.master.SipdMasterRepository;

import java.util.List;

public interface SipdMasterClassificationRepository<ENTITY extends SipdMasterClassificationEntity<SUBJECT>, SUBJECT extends DataMasterClassificationEntity> extends SipdMasterRepository<ENTITY, SUBJECT, String, Long> {

	List<ENTITY> findBySubjectIdAndIsDeletedFalse(String subjectId);

	List<ENTITY> findBySubjectIdAndIsDeletedTrue(String subjectId);

}