package com.rendyrobbani.keuangan.core.domain.entity.budget.record.mayor;

import com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal.DataBudgetJadwal;
import com.rendyrobbani.keuangan.core.domain.entity.budget.record.DataBudgetRecordEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.mayor.DataMasterMayor;
import com.rendyrobbani.keuangan.core.domain.vo.JabatanStatus;

import java.time.LocalDateTime;

public interface DataBudgetRecordMayor extends DataBudgetRecordEntity<DataMasterMayor, Byte> {

	String TABLE_NAME = "data_budget_record_mayor";

	@Override
	String id();

	@Override
	Long jadwalId();

	@Override
	DataBudgetJadwal jadwal();

	@Override
	Byte commonId();

	@Override
	DataMasterMayor common();

	JabatanStatus status();

	String name();

	String titlePrefix();

	String titleSuffix();

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

}