package com.rendyrobbani.keuangan.core.domain.entity;

import com.rendyrobbani.keuangan.core.domain.marker.audit.*;

import java.time.LocalDateTime;

public interface DataEntity<ID> extends BaseEntity<ID>,
                                        HasCreate,
                                        HasUpdate,
                                        HasUpdateMutator,
                                        HasDelete,
                                        HasDeleteMutator {

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