package com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening5.DataMasterRekening5;

public interface ReferenceDataMasterRekening5 {

	DataMasterRekening5 rekening5();

	String rekening5Id();

	default String rekening5Code() {
		if (this.rekening5() == null) return null;
		return this.rekening5().code();
	}

	default String rekening5Name() {
		if (this.rekening5() == null) return null;
		return this.rekening5().name();
	}

	default String rekening5Name(boolean toUpperCase) {
		if (this.rekening5() == null) return null;
		return this.rekening5().name(toUpperCase);
	}

}