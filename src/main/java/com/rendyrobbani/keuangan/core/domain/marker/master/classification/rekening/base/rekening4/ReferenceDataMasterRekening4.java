package com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening4;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening4.DataMasterRekening4;

public interface ReferenceDataMasterRekening4 {

	DataMasterRekening4 rekening4();

	String rekening4Id();

	default String rekening4Code() {
		if (this.rekening4() == null) return null;
		return this.rekening4().code();
	}

	default String rekening4Name() {
		if (this.rekening4() == null) return null;
		return this.rekening4().name();
	}

	default String rekening4Name(boolean toUpperCase) {
		if (this.rekening4() == null) return null;
		return this.rekening4().name(toUpperCase);
	}

}