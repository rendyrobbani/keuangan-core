package com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening6.SipdMasterRekening6;

import java.time.LocalDateTime;

public interface SipdMasterRekeningBeban6 extends SipdMasterRekening6<DataMasterRekeningBeban6> {

	String TABLE_NAME = "sipd_master_rekening_beban6";

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
	DataMasterRekeningBeban6 subject();

	@Override
	String subjectId();

}