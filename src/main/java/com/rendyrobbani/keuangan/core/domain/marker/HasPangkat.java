package com.rendyrobbani.keuangan.core.domain.marker;

import com.rendyrobbani.keuangan.core.domain.vo.Pangkat;

public interface HasPangkat {

	Pangkat pangkat();

	default String pangkatValue() {
		if (this.pangkat() == null) return null;
		return this.pangkat().value();
	}

	default String pangkatLabel() {
		if (this.pangkat() == null) return null;
		return this.pangkat().label();
	}

	default String pangkatTitle() {
		if (this.pangkat() == null) return null;
		return this.pangkat().title();
	}

}