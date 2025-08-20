package com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.common.classification.rekening.RekeningClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.DataMasterRekening1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2.DataMasterRekening2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening3.DataMasterRekening3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening4.DataMasterRekening4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening5.DataMasterRekening5;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening1.ReferenceDataMasterRekening1;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening2.ReferenceDataMasterRekening2;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening3.ReferenceDataMasterRekening3;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening4.ReferenceDataMasterRekening4;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening5.ReferenceDataMasterRekening5;

import java.time.LocalDateTime;

public interface DataMasterRekening6 extends DataMasterClassificationEntity,
                                             ReferenceDataMasterRekening1,
                                             ReferenceDataMasterRekening2,
                                             ReferenceDataMasterRekening3,
                                             ReferenceDataMasterRekening4,
                                             ReferenceDataMasterRekening5 {

	@Override
	String id();

	@Override
	String code();

	@Override
	String name();

	@Override
	boolean isLocked();

	@Override
	LocalDateTime lockedAt();

	@Override
	String lockedBy();

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
	DataMasterRekening1 rekening1();

	@Override
	DataMasterRekening2 rekening2();

	@Override
	DataMasterRekening3 rekening3();

	@Override
	DataMasterRekening4 rekening4();

	@Override
	DataMasterRekening5 rekening5();

	void create(RekeningClassification classification, String name, LocalDateTime createdAt, String createdBy);

	void update(String name, LocalDateTime updatedAt, String updatedBy);

}