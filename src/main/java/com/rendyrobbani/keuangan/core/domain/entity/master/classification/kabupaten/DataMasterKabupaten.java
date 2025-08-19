package com.rendyrobbani.keuangan.core.domain.entity.master.classification.kabupaten;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.provinsi.ReferenceDataMasterProvinsi;
import com.rendyrobbani.keuangan.core.domain.vo.classification.daerah.KabupatenClassification;

import java.time.LocalDateTime;

public interface DataMasterKabupaten extends DataMasterClassificationEntity,
                                             ReferenceDataMasterProvinsi {

	String TABLE_NAME = "data_master_kabupaten";

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
	String provinsiId();

	void create(KabupatenClassification classification, String name, LocalDateTime createdAt, String createdBy);

	void update(String name, LocalDateTime updatedAt, String updatedBy);

}