package com.rendyrobbani.keuangan.core.domain.entity.budget;

import com.rendyrobbani.keuangan.core.domain.entity.LogsEntity;

import java.time.LocalDateTime;

public interface LogsBudgetEntity<SUBJECT extends DataBudgetEntity<SUBJECTID>, SUBJECTID> extends LogsEntity<SUBJECT, SUBJECTID> {

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