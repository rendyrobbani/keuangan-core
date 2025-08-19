package com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening1;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.DataMasterRekening1;

public interface ReferenceDataMasterRekening1 {

	DataMasterRekening1 rekening1();

	String rekening1Id();

	default String rekening1Code() {
		if (this.rekening1() == null) return null;
		return this.rekening1().code();
	}

	default String rekening1Name() {
		if (this.rekening1() == null) return null;
		return this.rekening1().name();
	}

	default String rekening1Name(boolean toUpperCase) {
		if (this.rekening1() == null) return null;
		return this.rekening1().name(toUpperCase);
	}

}