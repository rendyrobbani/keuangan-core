package com.rendyrobbani.keuangan.core.domain.marker.master.fungsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.fungsi.DataMasterFungsi;

public interface ReferenceDataMasterFungsi {

	DataMasterFungsi fungsi();

	String fungsiId();

	default String fungsiCode() {
		if (this.fungsi() == null) return null;
		return this.fungsi().code();
	}

	default String fungsiName() {
		if (this.fungsi() == null) return null;
		return this.fungsi().name();
	}

	default String fungsiName(boolean toUpperCase) {
		if (this.fungsi() == null) return null;
		return this.fungsi().name(toUpperCase);
	}

}