package com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelurahan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.kabupaten.ReferenceDataMasterKabupaten;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.kecamatan.ReferenceDataMasterKecamatan;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.provinsi.ReferenceDataMasterProvinsi;
import com.rendyrobbani.keuangan.core.common.classification.lokasi.KelurahanClassification;

import java.time.LocalDateTime;

public interface DataMasterKelurahan extends DataMasterClassificationEntity,
                                             ReferenceDataMasterProvinsi,
                                             ReferenceDataMasterKabupaten,
                                             ReferenceDataMasterKecamatan {

	String TABLE_NAME = "data_master_kelurahan";

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
	String provinsiId();

	@Override
	String kabupatenId();

	@Override
	String kecamatanId();

	void create(KelurahanClassification classification, String name, LocalDateTime createdAt, String createdBy);

	void update(String name, LocalDateTime updatedAt, String updatedBy);

}