package com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2.SipdMasterRekening2;

import java.time.LocalDateTime;

public interface SipdMasterRekeningKewajiban2 extends SipdMasterRekening2<DataMasterRekeningKewajiban2> {

	String TABLE_NAME = "sipd_master_rekening_kewajiban2";

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
	DataMasterRekeningKewajiban2 subject();

	@Override
	String subjectId();

}