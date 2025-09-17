package com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.income.pendapatan.rincian;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonRincianEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.DataMasterRekening1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2.DataMasterRekening2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening3.DataMasterRekening3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening4.DataMasterRekening4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening5.DataMasterRekening5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening6.DataMasterRekening6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.DataMasterUrusan;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface DataBudgetCommonIncomePendapatanRincianEntity extends DataBudgetCommonRincianEntity {

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
	String rekening4Id();

	@Override
	String rekening5Id();

	@Override
	String rekening6Id();

	@Override
	String description();

	@Override
	String information();

	@Override
	BigDecimal volume1();

	@Override
	String satuan1();

	@Override
	BigDecimal volume2();

	@Override
	String satuan2();

	@Override
	BigDecimal volume3();

	@Override
	String satuan3();

	@Override
	BigDecimal volume4();

	@Override
	String satuan4();

	@Override
	BigDecimal price();

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

	@Override
	DataMasterRekening4 rekening4();

	@Override
	DataMasterRekening5 rekening5();

	@Override
	DataMasterRekening6 rekening6();

}