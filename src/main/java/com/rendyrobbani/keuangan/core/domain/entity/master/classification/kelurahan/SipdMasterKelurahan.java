package com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelurahan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.SipdMasterClassificationEntity;

import java.time.LocalDateTime;

public interface SipdMasterKelurahan extends SipdMasterClassificationEntity<DataMasterKelurahan> {

	String TABLE_NAME = "sipd_master_kelurahan";

	@Override
	Long id();

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
	DataMasterKelurahan subject();

	@Override
	String subjectId();

}