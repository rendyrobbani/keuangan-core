package com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pembiayaan.jenis;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonJenisEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.DataMasterRekening1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2.DataMasterRekening2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening3.DataMasterRekening3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.DataMasterUrusan;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface DataBudgetCommonIncomePembiayaanJenis extends DataBudgetCommonJenisEntity {

	String TABLE_NAME = "data_budget_common_income_pembiayaan_jenis";

	@Override
	String id();

	@Override
	String skpdId();

	@Override
	String unitId();

	@Override
	String urusanId();

	@Override
	String bidangId();

	@Override
	String rekening1Id();

	@Override
	String rekening2Id();

	@Override
	String rekening3Id();

	@Override
	BigDecimal sebelum();

	@Override
	BigDecimal total();

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

	@Override
	DataMasterUrusan urusan();

	@Override
	DataMasterBidang bidang();

	@Override
	DataMasterRekening1 rekening1();

	@Override
	DataMasterRekening2 rekening2();

	@Override
	DataMasterRekening3 rekening3();

}