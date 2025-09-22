package com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.belanja.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonOrganisasiEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLock;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLockMutator;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface DataBudgetCommonExpendBelanjaOrganisasi extends DataBudgetCommonOrganisasiEntity,
                                                                 HasLock,
                                                                 HasLockMutator {

	String TABLE_NAME = "data_budget_common_expend_belanja_organisasi";

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

	BigDecimal belanjaOperasiSebelum();

	BigDecimal belanjaModalSebelum();

	BigDecimal belanjaTidakTerdugaSebelum();

	BigDecimal belanjaTransferSebelum();

	BigDecimal belanjaOperasi();

	BigDecimal belanjaModal();

	BigDecimal belanjaTidakTerduga();

	BigDecimal belanjaTransfer();

	default BigDecimal belanjaOperasiSetelah() {
		return this.belanjaOperasi();
	}

	default BigDecimal belanjaModalSetelah() {
		return this.belanjaModal();
	}

	default BigDecimal belanjaTidakTerdugaSetelah() {
		return this.belanjaTidakTerduga();
	}

	default BigDecimal belanjaTransferSetelah() {
		return this.belanjaTransfer();
	}

}