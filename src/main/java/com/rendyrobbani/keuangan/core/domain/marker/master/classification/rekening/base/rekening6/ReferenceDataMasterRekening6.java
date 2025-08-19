package com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening6.DataMasterRekening6;

public interface ReferenceDataMasterRekening6 {

	DataMasterRekening6 rekening6();

	String rekening6Id();

	default String rekening6Code() {
		if (this.rekening6() == null) return null;
		return this.rekening6().code();
	}

	default String rekening6Name() {
		if (this.rekening6() == null) return null;
		return this.rekening6().name();
	}

	default String rekening6Name(boolean toUpperCase) {
		if (this.rekening6() == null) return null;
		return this.rekening6().name(toUpperCase);
	}

}