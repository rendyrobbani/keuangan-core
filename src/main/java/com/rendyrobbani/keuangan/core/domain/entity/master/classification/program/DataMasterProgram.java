package com.rendyrobbani.keuangan.core.domain.entity.master.classification.program;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.bidang.ReferenceDataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.urusan.ReferenceDataMasterUrusan;
import com.rendyrobbani.keuangan.core.common.classification.program.ProgramClassification;

import java.time.LocalDateTime;

public interface DataMasterProgram extends DataMasterClassificationEntity,
                                           ReferenceDataMasterUrusan,
                                           ReferenceDataMasterBidang {

	String TABLE_NAME = "data_master_program";

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
	String urusanId();

	@Override
	String bidangId();

	void create(ProgramClassification classification, String name, LocalDateTime createdAt, String createdBy);

	void update(String name, LocalDateTime updatedAt, String updatedBy);

}