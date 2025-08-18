package com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.vo.classification.urusan.UrusanClassification;

import java.time.LocalDateTime;

public interface DataMasterUrusan extends DataMasterClassificationEntity {

	String TABLE_NAME = "data_master_urusan";

	@Override
	String id();

	@Override
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

	void create(UrusanClassification classification, String name, LocalDateTime createdAt, String createdBy);

	void update(String name, LocalDateTime updatedAt, String updatedBy);

}