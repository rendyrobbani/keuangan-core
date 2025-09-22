package com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.belanja.jenis;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonJenisEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.fungsi.DataMasterFungsi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kegiatan.DataMasterKegiatan;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.program.DataMasterProgram;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.DataMasterRekening1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2.DataMasterRekening2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening3.DataMasterRekening3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subfungsi.DataMasterSubfungsi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subkegiatan.DataMasterSubkegiatan;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.DataMasterUrusan;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.fungsi.ReferenceDataMasterFungsi;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.kegiatan.ReferenceDataMasterKegiatan;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.program.ReferenceDataMasterProgram;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.subfungsi.ReferenceDataMasterSubfungsi;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.subkegiatan.ReferenceDataMasterSubkegiatan;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface DataBudgetCommonExpendBelanjaJenis extends DataBudgetCommonJenisEntity,
                                                            ReferenceDataMasterProgram,
                                                            ReferenceDataMasterKegiatan,
                                                            ReferenceDataMasterSubkegiatan,
                                                            ReferenceDataMasterFungsi,
                                                            ReferenceDataMasterSubfungsi {

	String TABLE_NAME = "data_budget_common_expend_belanja_jenis";

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
	String programId();

	String programCode();

	@Override
	String kegiatanId();

	String kegiatanCode();

	@Override
	String subkegiatanId();

	String subkegiatanCode();;

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

}