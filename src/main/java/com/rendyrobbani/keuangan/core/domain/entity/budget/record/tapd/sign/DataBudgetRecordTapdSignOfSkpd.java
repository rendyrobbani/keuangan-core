package com.rendyrobbani.keuangan.core.domain.entity.budget.record.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal.DataBudgetJadwal;
import com.rendyrobbani.keuangan.core.domain.entity.budget.record.DataBudgetRecordEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.record.organisasi.DataBudgetRecordOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.DataMasterTapdSign;
import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.DataMasterTapdSignOfSkpd;
import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.team.DataMasterTapdTeam;

import java.time.LocalDateTime;

public interface DataBudgetRecordTapdSignOfSkpd extends DataBudgetRecordEntity<DataMasterTapdSignOfSkpd, String> {

	@Override
	String id();

	String teamId();

	String signId();

	String skpdId();

	DataMasterTapdTeam team();

	DataMasterTapdSign sign();

	DataBudgetRecordTapdSign signRecord();

	DataMasterOrganisasi skpd();

	DataBudgetRecordOrganisasi skpdRecord();

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
	Long jadwalId();

	@Override
	DataBudgetJadwal jadwal();

	@Override
	String commonId();

	@Override
	DataMasterTapdSignOfSkpd common();

}