package com.rendyrobbani.keuangan.core.domain.marker.master.classification.kelompok;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelompok.DataMasterKelompok;

public interface ReferenceDataMasterKelompok {

	DataMasterKelompok kelompok();

	String kelompokId();

	default String kelompokCode() {
		if (this.kelompok() == null) return null;
		return this.kelompok().code();
	}

	default String kelompokName() {
		if (this.kelompok() == null) return null;
		return this.kelompok().name();
	}

	default String kelompokName(boolean toUpperCase) {
		if (this.kelompok() == null) return null;
		return this.kelompok().name(toUpperCase);
	}

}