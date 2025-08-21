package com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan_lo.pendapatan_lo2;

import com.rendyrobbani.keuangan.core.common.classification.rekening.RekeningClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.DataMasterRekening1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2.DataMasterRekening2;

import java.time.LocalDateTime;

public interface DataMasterPendapatanLo2 extends DataMasterRekening2 {

	String TABLE_NAME = "data_master_pendapatan_lo2";

	@Override
	String id();

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
	String rekening1Id();

	@Override
	DataMasterRekening1 rekening1();

	@Override
	void create(RekeningClassification classification, String name, LocalDateTime createdAt, String createdBy);

	@Override
	void update(String name, LocalDateTime updatedAt, String updatedBy);

}