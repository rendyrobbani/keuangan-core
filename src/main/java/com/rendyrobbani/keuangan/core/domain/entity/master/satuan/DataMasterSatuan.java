package com.rendyrobbani.keuangan.core.domain.entity.master.satuan;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;

import java.time.LocalDateTime;

public interface DataMasterSatuan extends DataMasterEntity<Long> {

	String TABLE_NAME = "data_master_satuan";

	@Override
	Long id();

	String name();

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