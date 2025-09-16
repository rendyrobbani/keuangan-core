package com.rendyrobbani.keuangan.core.domain.marker.master.classification.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;

public interface ReferenceUnit {

	DataMasterOrganisasi unit();

	String unitId();

	default String unitCode() {
		if (this.unit() == null) return null;
		return this.unit().code();
	}

	default String unitName() {
		if (this.unit() == null) return null;
		return this.unit().name();
	}

}