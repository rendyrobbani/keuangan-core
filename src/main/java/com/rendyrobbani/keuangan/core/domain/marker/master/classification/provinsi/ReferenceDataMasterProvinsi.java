package com.rendyrobbani.keuangan.core.domain.marker.master.classification.provinsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.provinsi.DataMasterProvinsi;

public interface ReferenceDataMasterProvinsi {

	DataMasterProvinsi provinsi();

	String provinsiId();

	default String provinsiCode() {
		if (this.provinsi() == null) return null;
		return this.provinsi().code();
	}

	default String provinsiName() {
		if (this.provinsi() == null) return null;
		return this.provinsi().name();
	}

	default String provinsiName(boolean toUpperCase) {
		if (this.provinsi() == null) return null;
		return this.provinsi().name(toUpperCase);
	}

}