package com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.team.DataMasterTapdTeam;
import com.rendyrobbani.keuangan.core.domain.entity.user.DataUser;
import com.rendyrobbani.keuangan.core.domain.marker.HasNameAndTitles;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLock;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLockMutator;

import java.time.LocalDateTime;

public interface DataMasterTapdSign extends DataMasterEntity<String>,
                                            HasNameAndTitles,
                                            HasLock,
                                            HasLockMutator {

	String TABLE_NAME = "data_master_tapd_sign";

	@Override
	String id();

	Short number();

	String position();

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

	DataMasterTapdTeam tapd();

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

	void create(DataUser user, Short number, String position, LocalDateTime createdAt, String createdBy);

	void update(DataUser user, Short number, String position, LocalDateTime updatedAt, String updatedBy);

}