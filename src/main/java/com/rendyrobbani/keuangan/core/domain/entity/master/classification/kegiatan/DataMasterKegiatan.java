package com.rendyrobbani.keuangan.core.domain.entity.master.classification.kegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.bidang.ReferenceDataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.fungsi.ReferenceDataMasterFungsi;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.program.ReferenceDataMasterProgram;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.subfungsi.ReferenceDataMasterSubfungsi;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.urusan.ReferenceDataMasterUrusan;
import com.rendyrobbani.keuangan.core.common.classification.kegiatan.KegiatanClassification;

import java.time.LocalDateTime;

public interface DataMasterKegiatan extends DataMasterClassificationEntity,
                                            ReferenceDataMasterUrusan,
                                            ReferenceDataMasterBidang,
                                            ReferenceDataMasterProgram,
                                            ReferenceDataMasterFungsi,
                                            ReferenceDataMasterSubfungsi {

	String TABLE_NAME = "data_master_kegiatan";

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
	String urusanId();

	@Override
	String bidangId();

	@Override
	String programId();

	@Override
	String fungsiId();

	@Override
	String subfungsiId();

	void create(KegiatanClassification classification, String name, LocalDateTime createdAt, String createdBy);

	void update(String name, LocalDateTime updatedAt, String updatedBy);

}