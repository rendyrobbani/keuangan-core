package com.rendyrobbani.keuangan.core.domain.entity.master.satuan;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLock;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLockMutator;

import java.time.LocalDateTime;

public interface DataMasterSatuan extends DataMasterEntity<Long>,
                                          HasLock,
                                          HasLockMutator {

	String TABLE_NAME = "data_master_satuan";

	@Override
	Long id();

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

	void create(Long id, String name, LocalDateTime createdAt, String createdBy);

	void update(String name, LocalDateTime updatedAt, String updatedBy);

}