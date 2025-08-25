package com.rendyrobbani.keuangan.core.domain.entity.master.tapd.team;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.entity.user.DataUser;
import com.rendyrobbani.keuangan.core.domain.marker.HasNameAndTitles;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLock;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLockMutator;

import java.time.LocalDateTime;

public interface DataMasterTapdTeam extends DataMasterEntity<String>,
                                            HasNameAndTitles,
                                            HasLock,
                                            HasLockMutator {

	String TABLE_NAME = "data_master_tapd_team";

	@Override
	String id();

	String position();

	boolean isCanLockCreate();

	boolean isCanLockUpdate();

	boolean isCanLockDetail();

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

	DataUser user();

	@Override
	default String name() {
		if (this.user() == null) return null;
		return this.user().name();
	}

	@Override
	default String titlePrefix() {
		if (this.user() == null) return null;
		return this.user().titlePrefix();
	}

	@Override
	default String titleSuffix() {
		if (this.user() == null) return null;
		return this.user().titleSuffix();
	}

	void create(DataUser user, String position, boolean isCanLockCreate, boolean isCanLockUpdate, boolean isCanLockDetail, LocalDateTime createdAt, String createdBy);

	void update(DataUser user, String position, boolean isCanLockCreate, boolean isCanLockUpdate, boolean isCanLockDetail, LocalDateTime updatedAt, String updatedBy);

}