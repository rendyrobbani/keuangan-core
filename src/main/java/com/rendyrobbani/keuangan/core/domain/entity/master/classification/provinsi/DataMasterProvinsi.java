package com.rendyrobbani.keuangan.core.domain.entity.master.classification.provinsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.vo.classification.daerah.ProvinsiClassification;

import java.time.LocalDateTime;

public interface DataMasterProvinsi extends DataMasterClassificationEntity {

	String TABLE_NAME = "data_master_provinsi";

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

	void create(ProvinsiClassification classification, String name, LocalDateTime createdAt, String createdBy);

	void update(String name, LocalDateTime updatedAt, String updatedBy);

}