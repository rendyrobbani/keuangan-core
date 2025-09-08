package com.rendyrobbani.keuangan.core.domain.entity.budget.record;

import com.rendyrobbani.keuangan.core.domain.entity.DataEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.DataBudgetEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal.DataBudgetJadwal;

public interface DataBudgetRecordEntity<COMMON extends DataEntity<COMMONID>, COMMONID> extends DataBudgetEntity<String> {

	@Override
	String id();

	Long jadwalId();

	DataBudgetJadwal jadwal();

	COMMONID commonId();

	COMMON common();

}