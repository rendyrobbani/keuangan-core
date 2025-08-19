package com.rendyrobbani.keuangan.core.domain.entity.master.classification;

import com.rendyrobbani.keuangan.core.domain.entity.master.LogsMasterEntity;

import java.time.LocalDateTime;

public interface LogsMasterClassificationEntity<SUBJECT extends DataMasterClassificationEntity> extends LogsMasterEntity<SUBJECT, String> {

	@Override
	Long id();

	boolean isLocked();

	@Override
	boolean isDeleted();

	@Override
	LocalDateTime loggedAt();

	@Override
	String loggedBy();

	@Override
	SUBJECT subject();

	@Override
	String subjectId();

}