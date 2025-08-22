package com.rendyrobbani.keuangan.core.domain.entity;

import com.rendyrobbani.keuangan.core.domain.marker.audit.HasCreate;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasCreateMutator;

import java.time.LocalDateTime;

public interface SelfEntity extends BaseEntity<Long>,
                                    HasCreate,
                                    HasCreateMutator {

	@Override
	Long id();

	@Override
	LocalDateTime createdAt();

	@Override
	String createdBy();

	@Override
	void create(LocalDateTime createdAt, String createdBy);

}