package com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening2;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2.DataMasterRekening2;

public interface ReferenceDataMasterRekening2 {

	DataMasterRekening2 rekening2();

	String rekening2Id();

	default String rekening2Code() {
		if (this.rekening2() == null) return null;
		return this.rekening2().code();
	}

	default String rekening2Name() {
		if (this.rekening2() == null) return null;
		return this.rekening2().name();
	}

	default String rekening2Name(boolean toUpperCase) {
		if (this.rekening2() == null) return null;
		return this.rekening2().name(toUpperCase);
	}

}