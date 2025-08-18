package com.rendyrobbani.keuangan.core.domain.marker.master.subfungsi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subfungsi.DataMasterSubfungsi;

public interface ReferenceDataMasterSubfungsi {

	DataMasterSubfungsi subfungsi();

	String subfungsiId();

	default String subfungsiCode() {
		if (this.subfungsi() == null) return null;
		return this.subfungsi().code();
	}

	default String subfungsiName() {
		if (this.subfungsi() == null) return null;
		return this.subfungsi().name();
	}

	default String subfungsiName(boolean toUpperCase) {
		if (this.subfungsi() == null) return null;
		return this.subfungsi().name(toUpperCase);
	}

}