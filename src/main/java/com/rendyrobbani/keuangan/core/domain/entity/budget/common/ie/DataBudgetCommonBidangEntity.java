package com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.DataBudgetCommonEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.DataMasterUrusan;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface DataBudgetCommonBidangEntity extends DataBudgetCommonEntity<String> {

	@Override
	String id();

	String skpdId();

	String unitId();

	String urusanId();

	String bidangId();

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

	DataMasterUrusan urusan();

	DataMasterBidang bidang();

}