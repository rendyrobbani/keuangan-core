package com.rendyrobbani.keuangan.core.domain.marker.master.classification.kelurahan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelurahan.DataMasterKelurahan;

public interface ReferenceDataMasterKelurahan {

	DataMasterKelurahan kelurahan();

	String kelurahanId();

	default String kelurahanCode() {
		if (this.kelurahan() == null) return null;
		return this.kelurahan().code();
	}

	default String kelurahanName() {
		if (this.kelurahan() == null) return null;
		return this.kelurahan().name();
	}

	default String kelurahanName(boolean toUpperCase) {
		if (this.kelurahan() == null) return null;
		return this.kelurahan().name(toUpperCase);
	}

}