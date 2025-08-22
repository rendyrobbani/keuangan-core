package com.rendyrobbani.keuangan.core.domain.entity.master.penerima;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.vo.BelanjaJenis;
import com.rendyrobbani.keuangan.core.domain.vo.PenerimaJenis;

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

	void create(Long id, String name, PenerimaJenis jenis, String address, LocalDateTime createdAt, String createdBy);

	void update(String name, PenerimaJenis jenis, String address, LocalDateTime updatedAt, String updatedBy);

}