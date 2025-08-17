package com.rendyrobbani.keuangan.core.domain.entity;

import java.time.LocalDateTime;

public interface LogsEntity<SUBJECT extends DataEntity<SUBJECTID>, SUBJECTID> extends BaseEntity<Long> {

	@Override
	Long id();

	LocalDateTime loggedAt();

	String loggedBy();

	SUBJECT subject();

	SUBJECTID subjectId();

	void create(SUBJECT subject, LocalDateTime createdAt, String createdBy);

}