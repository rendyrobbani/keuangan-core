package com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pendapatan.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonOrganisasiEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLock;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLockMutator;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface DataBudgetCommonIncomePendapatanOrganisasi extends DataBudgetCommonOrganisasiEntity,
                                                                    HasLock,
                                                                    HasLockMutator {

	String TABLE_NAME = "data_budget_common_income_pendapatan_organisasi";

	@Override
	String id();

	@Override
	String skpdId();

	@Override
	String unitId();

	@Override
	BigDecimal sebelum();

	@Override
	BigDecimal total();

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

	@Override
	DataMasterOrganisasi skpd();

	@Override
	DataMasterOrganisasi unit();

}