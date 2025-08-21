package com.rendyrobbani.keuangan.core.domain.marker.master.classification.sumber;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.sumber.DataMasterSumber;

public interface ReferenceDataMasterSumber {

	DataMasterSumber sumber();

	String sumberId();

	default String sumberCode() {
		if (this.sumber() == null) return null;
		return this.sumber().code();
	}

	default String sumberName() {
		if (this.sumber() == null) return null;
		return this.sumber().name();
	}

	default String sumberName(boolean toUpperCase) {
		if (this.sumber() == null) return null;
		return this.sumber().name(toUpperCase);
	}

}