package com.rendyrobbani.keuangan.core.domain.entity.budget;

import com.rendyrobbani.keuangan.core.domain.entity.DataEntity;

import java.time.LocalDateTime;

public interface DataBudgetEntity<ID> extends DataEntity<ID> {

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

}