package com.rendyrobbani.keuangan.core.domain.entity.master.tapd.team;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;

import java.time.LocalDateTime;

public interface DataMasterTapdTeamOfSkpd extends DataMasterEntity<String> {

	String TABLE_NAME = "data_master_tapd_team_of_skpd";

	@Override
	String id();

	String tapdId();

	String skpdId();

	DataMasterTapdTeam tapd();

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

	void create(String tapdId, String skpdId, LocalDateTime createdAt, String createdBy);

}