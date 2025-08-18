package com.rendyrobbani.keuangan.core.domain.entity.master.classification.subfungsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.marker.master.fungsi.ReferenceDataMasterFungsi;

import java.time.LocalDateTime;

public interface DataMasterSubfungsi extends DataMasterClassificationEntity,
                                             ReferenceDataMasterFungsi {

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
	String fungsiId();

}