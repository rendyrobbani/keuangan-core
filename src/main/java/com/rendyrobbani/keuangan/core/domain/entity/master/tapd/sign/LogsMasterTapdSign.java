package com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.master.LogsMasterEntity;

import java.time.LocalDateTime;

public interface LogsMasterTapdSign extends LogsMasterEntity<DataMasterTapdSign, String> {

	String TABLE_NAME = "logs_master_tapd_sign";

	@Override
	Long id();

	Short number();

	String tapdId();

	String position();

	boolean isLocked();

	@Override
	boolean isDeleted();

	@Override
	LocalDateTime loggedAt();

	@Override
	String loggedBy();

	@Override
	DataMasterTapdSign subject();

	@Override
	String subjectId();

}