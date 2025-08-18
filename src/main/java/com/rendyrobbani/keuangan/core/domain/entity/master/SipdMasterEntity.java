package com.rendyrobbani.keuangan.core.domain.entity.master;

import com.rendyrobbani.keuangan.core.domain.entity.SipdEntity;

import java.time.LocalDateTime;

public interface SipdMasterEntity<SUBJECT extends DataMasterEntity<SUBJECTID>, SUBJECTID, ID> extends SipdEntity<SUBJECT, SUBJECTID, ID> {

	@Override
	ID id();

	@Override
	LocalDateTime createdAt();

	@Override
	String createdBy();

	@Override
	LocalDateTime updatedAt();

	@Override
	String updatedBy();

	@Override
	boolean isDeleted();

	@Override
	LocalDateTime deletedAt();

	@Override
	String deletedBy();

	@Override
	SUBJECT subject();

	@Override
	SUBJECTID subjectId();

}