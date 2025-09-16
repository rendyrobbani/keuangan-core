package com.rendyrobbani.keuangan.core.domain.marker.master.classification.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;

public interface ReferenceSkpd {

	DataMasterOrganisasi skpd();

	String skpdId();

	default String skpdCode() {
		if (this.skpd() == null) return null;
		return this.skpd().code();
	}

	default String skpdName() {
		if (this.skpd() == null) return null;
		return this.skpd().name();
	}

}