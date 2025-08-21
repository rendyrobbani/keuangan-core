package com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelompok;

import com.rendyrobbani.keuangan.core.common.classification.kelompok.KelompokClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.vo.KomponenType;

import java.time.LocalDateTime;

public interface DataMasterKelompok extends DataMasterClassificationEntity {

	String TABLE_NAME = "data_master_kelompok";

	@Override
	String id();

	@Override
	String code();

	@Override
	String name();

	KomponenType type();

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

	Integer level();

	String kelompok1Id();

	String kelompok2Id();

	String kelompok3Id();

	String kelompok4Id();

	String kelompok5Id();

	String kelompok6Id();

	void create(KelompokClassification classification, String name, KomponenType type, boolean isEnabled, LocalDateTime createdAt, String createdBy);

	void update(String name, KomponenType type, boolean isEnabled, LocalDateTime updatedAt, String updatedBy);

}