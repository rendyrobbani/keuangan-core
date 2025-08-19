package com.rendyrobbani.keuangan.core.domain.marker.master.classification.kecamatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kecamatan.DataMasterKecamatan;

public interface ReferenceDataMasterKecamatan {

	DataMasterKecamatan kecamatan();

	String kecamatanId();

	default String kecamatanCode() {
		if (this.kecamatan() == null) return null;
		return this.kecamatan().code();
	}

	default String kecamatanName() {
		if (this.kecamatan() == null) return null;
		return this.kecamatan().name();
	}

	default String kecamatanName(boolean toUpperCase) {
		if (this.kecamatan() == null) return null;
		return this.kecamatan().name(toUpperCase);
	}

}