package com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.SipdMasterClassificationEntity;

import java.time.LocalDateTime;

public interface SipdMasterRekening6 extends SipdMasterClassificationEntity<DataMasterRekening6> {

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
	DataMasterRekening6 subject();

	@Override
	String subjectId();

}