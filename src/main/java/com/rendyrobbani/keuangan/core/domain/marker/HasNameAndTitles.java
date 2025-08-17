package com.rendyrobbani.keuangan.core.domain.marker;

import com.rendyrobbani.keuangan.core.common.util.name.NameUtil;

public interface HasNameAndTitles extends HasName {

	String titlePrefix();

	String titleSuffix();

	default String onlyName(boolean toUpperCase) {
		return NameUtil.onlyName(this.name(), toUpperCase);
	}

	default String fullName(boolean toUpperCase) {
		return NameUtil.fullName(this.name(), toUpperCase, this.titlePrefix(), this.titleSuffix());
	}

}