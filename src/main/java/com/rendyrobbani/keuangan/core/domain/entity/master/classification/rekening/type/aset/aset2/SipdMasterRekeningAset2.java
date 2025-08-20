package com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.aset.aset2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.SipdMasterRekening1;

import java.time.LocalDateTime;

public interface SipdMasterRekeningAset2 extends SipdMasterRekening1<DataMasterRekeningAset2> {

	String TABLE_NAME = "sipd_master_rekening_aset2";

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
	DataMasterRekeningAset2 subject();

	@Override
	String subjectId();

}