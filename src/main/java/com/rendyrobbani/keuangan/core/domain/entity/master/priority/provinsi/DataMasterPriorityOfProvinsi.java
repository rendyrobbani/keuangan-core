package com.rendyrobbani.keuangan.core.domain.entity.master.priority.provinsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.DataMasterPriorityEntity;

import java.time.LocalDateTime;

public interface DataMasterPriorityOfProvinsi extends DataMasterPriorityEntity {

	String TABLE_NAME = "data_master_priority_of_provinsi";

	@Override
	Long id();

	@Override
	Short year();

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

}