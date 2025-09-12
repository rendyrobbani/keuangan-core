package com.rendyrobbani.keuangan.core.domain.entity.budget.record.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal.DataBudgetJadwal;
import com.rendyrobbani.keuangan.core.domain.entity.budget.record.DataBudgetRecordEntity;
import com.rendyrobbani.keuangan.core.domain.marker.HasNameAndTitles;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLock;

import java.time.LocalDateTime;

public interface DataBudgetRecordTapdSign extends DataBudgetRecordEntity<DataBudgetRecordTapdSign, String>,
                                                  HasNameAndTitles,
                                                  HasLock {

	String TABLE_NAME = "data_budget_record_tapd_sign";

	@Override
	String id();

	Short number();

	String teamId();

	String position();

	@Override
	String name();

	@Override
	String titlePrefix();

	@Override
	String titleSuffix();

	@Override
	LocalDateTime createdAt();

	@Override
	boolean isLocked();

	@Override
	LocalDateTime lockedAt();

	@Override
	String lockedBy();

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
	DataBudgetRecordTapdSign common();

}