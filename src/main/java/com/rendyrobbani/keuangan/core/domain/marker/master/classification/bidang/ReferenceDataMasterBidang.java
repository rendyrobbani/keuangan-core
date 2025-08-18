package com.rendyrobbani.keuangan.core.domain.marker.master.classification.bidang;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;

public interface ReferenceDataMasterBidang {

	DataMasterBidang bidang();

	String bidangId();

	default String bidangCode() {
		if (this.bidang() == null) return null;
		return this.bidang().code();
	}

	default String bidangName() {
		if (this.bidang() == null) return null;
		return this.bidang().name();
	}

	default String bidangName(boolean toUpperCase) {
		if (this.bidang() == null) return null;
		return this.bidang().name(toUpperCase);
	}

}