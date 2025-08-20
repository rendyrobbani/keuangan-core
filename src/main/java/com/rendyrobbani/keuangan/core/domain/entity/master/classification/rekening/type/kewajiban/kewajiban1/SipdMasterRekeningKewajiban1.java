package com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.SipdMasterRekening1;

import java.time.LocalDateTime;

public interface SipdMasterRekeningKewajiban1 extends SipdMasterRekening1<DataMasterRekeningKewajiban1> {

	String TABLE_NAME = "sipd_master_rekening_kewajiban1";

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
	DataMasterRekeningKewajiban1 subject();

	@Override
	String subjectId();

}