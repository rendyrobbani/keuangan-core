package com.rendyrobbani.keuangan.core.domain.repository.master;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.LogsMasterEntity;
import com.rendyrobbani.keuangan.core.domain.repository.Repository;

import java.util.List;

public interface LogsMasterRepository<ENTITY extends LogsMasterEntity<SUBJECT, SUBJECTID>, SUBJECT extends DataMasterEntity<SUBJECTID>, SUBJECTID> extends Repository<ENTITY, Long> {

	List<ENTITY> findBySubjectId(SUBJECTID subjectId);

	List<ENTITY> findBySubjectIdAndIsDeletedFalse(SUBJECTID subjectId);

	List<ENTITY> findBySubjectIdAndIsDeletedTrue(SUBJECTID subjectId);

}