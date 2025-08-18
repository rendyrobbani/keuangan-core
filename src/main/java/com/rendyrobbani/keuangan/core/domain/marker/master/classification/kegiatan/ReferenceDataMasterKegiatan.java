package com.rendyrobbani.keuangan.core.domain.marker.master.classification.kegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kegiatan.DataMasterKegiatan;

public interface ReferenceDataMasterKegiatan {

	DataMasterKegiatan kegiatan();

	String kegiatanId();

	default String kegiatanCode() {
		if (this.kegiatan() == null) return null;
		return this.kegiatan().code();
	}

	default String kegiatanName() {
		if (this.kegiatan() == null) return null;
		return this.kegiatan().name();
	}

	default String kegiatanName(boolean toUpperCase) {
		if (this.kegiatan() == null) return null;
		return this.kegiatan().name(toUpperCase);
	}

}