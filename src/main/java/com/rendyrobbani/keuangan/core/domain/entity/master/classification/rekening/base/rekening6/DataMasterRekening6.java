package com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.common.classification.rekening.RekeningClassification;

import java.time.LocalDateTime;

public interface DataMasterRekening6 extends DataMasterClassificationEntity {

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

	String rekening1Id();

	String rekening2Id();

	String rekening3Id();

	String rekening4Id();

	String rekening5Id();

	void create(RekeningClassification classification, String name, LocalDateTime createdAt, String createdBy);

	void update(String name, LocalDateTime updatedAt, String updatedBy);

}