package com.rendyrobbani.keuangan.core.domain.entity.master.penerima;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.vo.BelanjaJenis;

import java.time.LocalDateTime;

public interface DataMasterPenerima extends DataMasterEntity<Long> {

	String TABLE_NAME = "data_master_penerima";

	@Override
	Long id();

	String name();

	BelanjaJenis jenis();

	String address();

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