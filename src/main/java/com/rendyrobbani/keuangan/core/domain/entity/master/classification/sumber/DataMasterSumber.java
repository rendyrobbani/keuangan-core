package com.rendyrobbani.keuangan.core.domain.entity.master.classification.sumber;

import com.rendyrobbani.keuangan.core.common.classification.sumber.SumberClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;

import java.time.LocalDateTime;

public interface DataMasterSumber extends DataMasterClassificationEntity {

	String TABLE_NAME = "data_master_sumber";

	@Override
	String id();

	@Override
	String code();

	@Override
	String name();

	boolean isEnabled();

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

	Byte level();

	String sumber1Id();

	String sumber2Id();

	String sumber3Id();

	String sumber4Id();

	String sumber5Id();

	String sumber6Id();

	boolean isUmum();

	boolean isKhusus();

	void create(SumberClassification classification, String name, boolean isEnabled, LocalDateTime createdAt, String createdBy);

	void update(String name, boolean isEnabled, LocalDateTime updatedAt, String updatedBy);

}