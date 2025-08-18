package com.rendyrobbani.keuangan.core.domain.entity.master.classification;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.marker.HasName;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLock;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLockMutator;

import java.time.LocalDateTime;

public interface DataMasterClassificationEntity extends DataMasterEntity<String>,
                                                        HasName,
                                                        HasLock,
                                                        HasLockMutator {

	@Override
	String id();

	String code();

	@Override
	String name();

	@Override
	boolean isLocked();

	@Override
	LocalDateTime lockedAt();

	@Override
	String lockedBy();

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