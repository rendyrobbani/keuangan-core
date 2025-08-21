package com.rendyrobbani.keuangan.core.domain.entity.master.priority.nasional;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.DataMasterPriorityEntity;

import java.time.LocalDateTime;

public interface DataMasterPriorityOfNasional extends DataMasterPriorityEntity {

	String TABLE_NAME = "data_master_priority_of_nasional";

	@Override
	Long id();

	@Override
	Short year();

	Short fromYear();

	Short intoYear();

	@Override
	Byte number();

	@Override
	String name();

	@Override
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

	@Override
	void create(Long id, Short year, Byte number, String name, String sipdName, LocalDateTime createdAt, String createdBy);

	@Override
	void update(Short year, Byte number, String name, String sipdName, LocalDateTime updatedAt, String updatedBy);

}