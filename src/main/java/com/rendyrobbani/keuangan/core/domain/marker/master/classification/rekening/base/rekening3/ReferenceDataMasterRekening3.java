package com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening3;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening3.DataMasterRekening3;

public interface ReferenceDataMasterRekening3 {

	DataMasterRekening3 rekening3();

	String rekening3Id();

	default String rekening3Code() {
		if (this.rekening3() == null) return null;
		return this.rekening3().code();
	}

	default String rekening3Name() {
		if (this.rekening3() == null) return null;
		return this.rekening3().name();
	}

	default String rekening3Name(boolean toUpperCase) {
		if (this.rekening3() == null) return null;
		return this.rekening3().name(toUpperCase);
	}

}