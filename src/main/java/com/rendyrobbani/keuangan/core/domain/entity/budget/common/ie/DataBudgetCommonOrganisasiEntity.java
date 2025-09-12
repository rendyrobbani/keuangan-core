package com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.DataBudgetCommonEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface DataBudgetCommonOrganisasiEntity extends DataBudgetCommonEntity<String> {

	@Override
	String id();

	String skpdId();

	String unitId();

	BigDecimal sebelum();

	BigDecimal setelah();

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

	DataMasterOrganisasi skpd();

	DataMasterOrganisasi unit();

}