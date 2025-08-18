package com.rendyrobbani.keuangan.core.domain.repository.master;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.SipdMasterEntity;
import com.rendyrobbani.keuangan.core.domain.repository.Repository;

import java.util.List;

public interface SipdMasterRepository<ENTITY extends SipdMasterEntity<SUBJECT, SUBJECTID, ID>, SUBJECT extends DataMasterEntity<SUBJECTID>, SUBJECTID, ID> extends Repository<ENTITY, ID> {

	List<ENTITY> findByIsDeletedFalse();

	List<ENTITY> findByIsDeletedTrue();

	List<ENTITY> findBySubjectId(SUBJECTID subjectId);

}