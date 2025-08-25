package com.rendyrobbani.keuangan.core.domain.entity.master.tapd.team;

import com.rendyrobbani.keuangan.core.domain.entity.master.LogsMasterEntity;

import java.time.LocalDateTime;

public interface LogsMasterTapdTeam extends LogsMasterEntity<DataMasterTapdTeam, String> {

	String TABLE_NAME = "logs_master_tapd_team";

	@Override
	Long id();

	String position();

	boolean isCanLockCreate();

	boolean isCanLockUpdate();

	boolean isCanLockDetail();

	boolean isLocked();

	@Override
	boolean isDeleted();

	@Override
	LocalDateTime loggedAt();

	@Override
	String loggedBy();

	@Override
	DataMasterTapdTeam subject();

	@Override
	String subjectId();

}