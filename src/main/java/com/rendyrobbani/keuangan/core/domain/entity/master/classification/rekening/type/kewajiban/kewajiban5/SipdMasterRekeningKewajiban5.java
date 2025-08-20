package com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.kewajiban.kewajiban5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening5.SipdMasterRekening5;

import java.time.LocalDateTime;

public interface SipdMasterRekeningKewajiban5 extends SipdMasterRekening5<DataMasterRekeningKewajiban5> {

	String TABLE_NAME = "sipd_master_rekening_kewajiban5";

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
	DataMasterRekeningKewajiban5 subject();

	@Override
	String subjectId();

}