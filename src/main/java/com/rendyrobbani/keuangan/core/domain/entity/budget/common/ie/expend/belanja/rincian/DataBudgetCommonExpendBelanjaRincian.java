package com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.belanja.rincian;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonRincianEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.fungsi.DataMasterFungsi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kegiatan.DataMasterKegiatan;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.program.DataMasterProgram;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.DataMasterRekening1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2.DataMasterRekening2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening3.DataMasterRekening3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening4.DataMasterRekening4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening5.DataMasterRekening5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening6.DataMasterRekening6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subfungsi.DataMasterSubfungsi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subkegiatan.DataMasterSubkegiatan;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.sumber.DataMasterSumber;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.DataMasterUrusan;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.fungsi.ReferenceDataMasterFungsi;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.kegiatan.ReferenceDataMasterKegiatan;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.program.ReferenceDataMasterProgram;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.subfungsi.ReferenceDataMasterSubfungsi;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.subkegiatan.ReferenceDataMasterSubkegiatan;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.sumber.ReferenceDataMasterSumber;
import com.rendyrobbani.keuangan.core.domain.vo.BelanjaJenis;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface DataBudgetCommonExpendBelanjaRincian extends DataBudgetCommonRincianEntity,
                                                              ReferenceDataMasterProgram,
                                                              ReferenceDataMasterKegiatan,
                                                              ReferenceDataMasterSubkegiatan,
                                                              ReferenceDataMasterFungsi,
                                                              ReferenceDataMasterSubfungsi,
                                                              ReferenceDataMasterSumber {

	String TABLE_NAME = "data_budget_common_expend_belanja_rincian";

	@Override
	Long id();

	@Override
	String skpdId();

	@Override
	String unitId();

	@Override
	String urusanId();

	@Override
	String bidangId();

	@Override
	String programId();

	@Override
	String kegiatanId();

	@Override
	String subkegiatanId();

	@Override
	String fungsiId();

	@Override
	String subfungsiId();

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
	String sumberId();

	BelanjaJenis jenis();

	boolean isHibah();

	boolean isBansos();

	String penerima();

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

	BigDecimal pajak();

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
	DataMasterProgram program();

	@Override
	DataMasterKegiatan kegiatan();

	@Override
	DataMasterSubkegiatan subkegiatan();

	@Override
	DataMasterFungsi fungsi();

	@Override
	DataMasterSubfungsi subfungsi();

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

	@Override
	DataMasterSumber sumber();

}