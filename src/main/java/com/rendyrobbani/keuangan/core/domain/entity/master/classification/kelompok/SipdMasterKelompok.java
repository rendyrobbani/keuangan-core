package com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelompok;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.SipdMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.vo.KomponenType;

import java.time.LocalDateTime;

public interface SipdMasterKelompok extends SipdMasterClassificationEntity<DataMasterKelompok> {

	String TABLE_NAME = "sipd_master_kelompok";

	@Override
	Long id();

	@Override
	String code();

	@Override
	String name();

	KomponenType type();

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
	DataMasterKelompok subject();

	@Override
	String subjectId();

	void create(Long id, String code, String name, KomponenType type, String subjectId, boolean isLocked, LocalDateTime createdAt, String createdBy);

	void update(String code, String name, KomponenType type, String subjectId, boolean isLocked, LocalDateTime updatedAt, String updatedBy);

}