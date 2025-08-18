package com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.SipdMasterClassificationEntity;

import java.time.LocalDateTime;

public interface SipdMasterUrusan extends SipdMasterClassificationEntity<DataMasterUrusan> {

	String TABLE_NAME = "sipd_master_urusan";

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
	DataMasterUrusan subject();

	@Override
	String subjectId();

}