package com.rendyrobbani.keuangan.core.domain.marker.master.classification.urusan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.DataMasterUrusan;

public interface ReferenceDataMasterUrusan {

	DataMasterUrusan urusan();

	String urusanId();

	default String urusanCode() {
		if (this.urusan() == null) return null;
		return this.urusan().code();
	}

	default String urusanName() {
		if (this.urusan() == null) return null;
		return this.urusan().name();
	}

	default String urusanName(boolean toUpperCase) {
		if (this.urusan() == null) return null;
		return this.urusan().name(toUpperCase);
	}

}