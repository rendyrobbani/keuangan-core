package com.rendyrobbani.keuangan.core.domain.entity.master.classification.subfungsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.fungsi.ReferenceDataMasterFungsi;
import com.rendyrobbani.keuangan.core.common.classification.fungsi.SubfungsiClassification;

import java.time.LocalDateTime;

public interface DataMasterSubfungsi extends DataMasterClassificationEntity,
                                             ReferenceDataMasterFungsi {

	String TABLE_NAME = "data_master_subfungsi";

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

	@Override
	String fungsiId();

	void create(SubfungsiClassification classification, String name, LocalDateTime createdAt, String createdBy);

	void update(String name, LocalDateTime updatedAt, String updatedBy);

}