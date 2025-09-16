package com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening4.DataMasterRekening4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening5.DataMasterRekening5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening6.DataMasterRekening6;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening4.ReferenceDataMasterRekening4;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening5.ReferenceDataMasterRekening5;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening6.ReferenceDataMasterRekening6;

public interface DataBudgetCommonRekeningEntity extends DataBudgetCommonJenisEntity,
                                                        ReferenceDataMasterRekening4,
                                                        ReferenceDataMasterRekening5,
                                                        ReferenceDataMasterRekening6 {

	@Override
	String rekening4Id();

	@Override
	String rekening5Id();

	@Override
	String rekening6Id();

	@Override
	DataMasterRekening4 rekening4();

	@Override
	DataMasterRekening5 rekening5();

	@Override
	DataMasterRekening6 rekening6();

}