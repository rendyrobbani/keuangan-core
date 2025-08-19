package com.rendyrobbani.keuangan.core.domain.marker.master.classification.kabupaten;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kabupaten.DataMasterKabupaten;

public interface ReferenceDataMasterKabupaten {

	DataMasterKabupaten kabupaten();

	String kabupatenId();

	default String kabupatenCode() {
		if (this.kabupaten() == null) return null;
		return this.kabupaten().code();
	}

	default String kabupatenName() {
		if (this.kabupaten() == null) return null;
		return this.kabupaten().name();
	}

	default String kabupatenName(boolean toUpperCase) {
		if (this.kabupaten() == null) return null;
		return this.kabupaten().name(toUpperCase);
	}

}