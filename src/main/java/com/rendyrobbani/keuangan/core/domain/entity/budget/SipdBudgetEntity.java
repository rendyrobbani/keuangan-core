package com.rendyrobbani.keuangan.core.domain.entity.budget;

import com.rendyrobbani.keuangan.core.domain.entity.SipdEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.DataBudgetEntity;

import java.time.LocalDateTime;

public interface SipdBudgetEntity<SUBJECT extends DataBudgetEntity<SUBJECTID>, SUBJECTID, ID> extends SipdEntity<SUBJECT, SUBJECTID, ID> {

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