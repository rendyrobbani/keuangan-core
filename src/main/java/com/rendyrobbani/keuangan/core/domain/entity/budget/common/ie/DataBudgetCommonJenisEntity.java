package com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.DataBudgetCommonEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.DataMasterRekening1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2.DataMasterRekening2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening3.DataMasterRekening3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.DataMasterUrusan;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface DataBudgetCommonJenisEntity extends DataBudgetCommonEntity<String> {

	@Override
	String id();

	String skpdId();

	String unitId();

	String urusanId();

	String bidangId();

	String rekening1Id();

	String rekening2Id();

	String rekening3Id();

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

	DataMasterRekening1 rekening1();

	DataMasterRekening2 rekening2();

	DataMasterRekening3 rekening3();

}