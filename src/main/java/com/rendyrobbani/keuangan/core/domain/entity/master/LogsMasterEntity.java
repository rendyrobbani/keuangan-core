package com.rendyrobbani.keuangan.core.domain.entity.master;

import com.rendyrobbani.keuangan.core.domain.entity.LogsEntity;

import java.time.LocalDateTime;

public interface LogsMasterEntity<SUBJECT extends DataMasterEntity<SUBJECTID>, SUBJECTID> extends LogsEntity<SUBJECT, SUBJECTID> {

	@Override
	Long id();

	boolean isDeleted();

	@Override
	LocalDateTime loggedAt();

	@Override
	String loggedBy();

	@Override
	SUBJECT subject();

	@Override
	SUBJECTID subjectId();

}