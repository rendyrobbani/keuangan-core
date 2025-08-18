package com.rendyrobbani.keuangan.core.domain.entity.master.classification;

import com.rendyrobbani.keuangan.core.domain.entity.master.SipdMasterEntity;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLock;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLockMutator;

import java.time.LocalDateTime;

public interface SipdMasterClassificationEntity<SUBJECT extends DataMasterClassificationEntity> extends SipdMasterEntity<SUBJECT, String, Long>,
                                                                                                        HasLock,
                                                                                                        HasLockMutator {

	@Override
	Long id();

	String code();

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
	SUBJECT subject();

	@Override
	String subjectId();

	void create(Long id, String code, String name, String subjectId, LocalDateTime createdAt, String createdBy);

	void update(String code, String name, String subjectId, LocalDateTime createdAt, String createdBy);

}