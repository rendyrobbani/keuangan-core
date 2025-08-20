package com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2.SipdMasterRekening2;

import java.time.LocalDateTime;

public interface SipdMasterRekeningBelanja2 extends SipdMasterRekening2<DataMasterRekeningBelanja2> {

	String TABLE_NAME = "sipd_master_rekening_belanja2";

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
	DataMasterRekeningBelanja2 subject();

	@Override
	String subjectId();

}