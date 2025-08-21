package com.rendyrobbani.keuangan.core.domain.entity.master.classification.sumber;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.SipdMasterClassificationEntity;

import java.time.LocalDateTime;

public interface SipdMasterSumber extends SipdMasterClassificationEntity<DataMasterSumber> {

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
	DataMasterSumber subject();

	@Override
	String subjectId();

	@Override
	void create(Long id, String code, String name, String subjectId, boolean isLocked, LocalDateTime createdAt, String createdBy);

	@Override
	void update(String code, String name, String subjectId, boolean isLocked, LocalDateTime updatedAt, String updatedBy);

}