package com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.DataBudgetCommonEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.fungsi.DataMasterFungsi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kegiatan.DataMasterKegiatan;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.program.DataMasterProgram;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subfungsi.DataMasterSubfungsi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subkegiatan.DataMasterSubkegiatan;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.DataMasterUrusan;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.bidang.ReferenceDataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.fungsi.ReferenceDataMasterFungsi;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.kegiatan.ReferenceDataMasterKegiatan;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.program.ReferenceDataMasterProgram;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.subfungsi.ReferenceDataMasterSubfungsi;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.subkegiatan.ReferenceDataMasterSubkegiatan;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.urusan.ReferenceDataMasterUrusan;

public interface DataBudgetCommonSubkegiatanEntity extends DataBudgetCommonEntity<String>,
                                                           DataBudgetCommonOrganisasiEntity,
                                                           ReferenceDataMasterUrusan,
                                                           ReferenceDataMasterBidang,
                                                           ReferenceDataMasterProgram,
                                                           ReferenceDataMasterKegiatan,
                                                           ReferenceDataMasterSubkegiatan,
                                                           ReferenceDataMasterFungsi,
                                                           ReferenceDataMasterSubfungsi {

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

}