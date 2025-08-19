package com.rendyrobbani.keuangan.core.domain.marker.master.classification.subkegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subkegiatan.DataMasterSubkegiatan;

public interface ReferenceDataMasterSubkegiatan {

	DataMasterSubkegiatan subkegiatan();

	String subkegiatanId();

	default String subkegiatanCode() {
		if (this.subkegiatan() == null) return null;
		return this.subkegiatan().code();
	}

	default String subkegiatanCode(String bidangCode) {
		if (this.subkegiatan() == null) return null;
		return this.subkegiatan().code().replace("X.XX", bidangCode != null ? bidangCode : "X.XX");
	}

	default String subkegiatanName() {
		if (this.subkegiatan() == null) return null;
		return this.subkegiatan().name();
	}

	default String subkegiatanName(boolean toUpperCase) {
		if (this.subkegiatan() == null) return null;
		return this.subkegiatan().name(toUpperCase);
	}

}