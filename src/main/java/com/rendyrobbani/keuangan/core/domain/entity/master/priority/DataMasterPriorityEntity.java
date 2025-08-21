package com.rendyrobbani.keuangan.core.domain.entity.master.priority;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLock;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLockMutator;

import java.time.LocalDateTime;

public interface DataMasterPriorityEntity extends DataMasterEntity<Long>,
                                                  HasLock,
                                                  HasLockMutator {

	@Override
	Long id();

	Short year();

	Byte number();

	String name();

	String sipdName();

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

	void create(Long id, Short year, Byte number, String name, String sipdName, LocalDateTime createdAt, String createdBy);

	void update(Short year, Byte number, String name, String sipdName, LocalDateTime updatedAt, String updatedBy);

}