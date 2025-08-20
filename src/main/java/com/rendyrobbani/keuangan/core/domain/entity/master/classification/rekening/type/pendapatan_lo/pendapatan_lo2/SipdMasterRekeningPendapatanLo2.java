package com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2.SipdMasterRekening2;

import java.time.LocalDateTime;

public interface SipdMasterRekeningPendapatanLo2 extends SipdMasterRekening2<DataMasterRekeningPendapatanLo2> {

	String TABLE_NAME = "sipd_master_rekening_pendapatan_lo2";

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
	DataMasterRekeningPendapatanLo2 subject();

	@Override
	String subjectId();

}