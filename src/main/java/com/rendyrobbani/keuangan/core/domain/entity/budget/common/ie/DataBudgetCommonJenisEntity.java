package com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.DataMasterRekening1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2.DataMasterRekening2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening3.DataMasterRekening3;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening1.ReferenceDataMasterRekening1;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening2.ReferenceDataMasterRekening2;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening3.ReferenceDataMasterRekening3;

public interface DataBudgetCommonJenisEntity extends DataBudgetCommonBidangEntity,
                                                     ReferenceDataMasterRekening1,
                                                     ReferenceDataMasterRekening2,
                                                     ReferenceDataMasterRekening3 {

	@Override
	String rekening1Id();

	@Override
	String rekening2Id();

	@Override
	String rekening3Id();

	@Override
	DataMasterRekening1 rekening1();

	@Override
	DataMasterRekening2 rekening2();

	@Override
	DataMasterRekening3 rekening3();

}