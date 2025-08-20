package com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.beban.beban3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening3.SipdMasterRekening3;

import java.time.LocalDateTime;

public interface SipdMasterRekeningBeban3 extends SipdMasterRekening3<DataMasterRekeningBeban3> {

	String TABLE_NAME = "sipd_master_rekening_beban3";

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
	DataMasterRekeningBeban3 subject();

	@Override
	String subjectId();

}