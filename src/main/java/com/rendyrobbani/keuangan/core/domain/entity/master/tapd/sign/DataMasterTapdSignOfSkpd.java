package com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.team.DataMasterTapdTeam;

import java.time.LocalDateTime;

public interface DataMasterTapdSignOfSkpd extends DataMasterEntity<String> {

	String TABLE_NAME = "data_master_tapd_sign_of_skpd";

	@Override
	String id();

	String teamId();

	String signId();

	String skpdId();

	DataMasterTapdTeam team();

	DataMasterTapdSign sign();

	DataMasterOrganisasi skpd();

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

	void create(String tapdId, String signId, String skpdId, LocalDateTime createdAt, String createdBy);

}