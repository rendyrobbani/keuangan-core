package com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening4.SipdMasterRekening4;

import java.time.LocalDateTime;

public interface SipdMasterRekeningPendapatanLo4 extends SipdMasterRekening4<DataMasterRekeningPendapatanLo4> {

	String TABLE_NAME = "sipd_master_rekening_pendapatan_lo4";

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
	DataMasterRekeningPendapatanLo4 subject();

	@Override
	String subjectId();

}