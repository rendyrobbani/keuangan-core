package com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.common.classification.rekening.RekeningClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.DataMasterRekening1;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening1.ReferenceDataMasterRekening1;

import java.time.LocalDateTime;

public interface DataMasterRekening2 extends DataMasterClassificationEntity,
                                             ReferenceDataMasterRekening1 {

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

	void create(RekeningClassification classification, String name, LocalDateTime createdAt, String createdBy);

	void update(String name, LocalDateTime updatedAt, String updatedBy);

}