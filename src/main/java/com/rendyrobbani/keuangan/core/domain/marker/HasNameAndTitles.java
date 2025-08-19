package com.rendyrobbani.keuangan.core.domain.marker;

import com.rendyrobbani.keuangan.core.common.util.name.NameUtil;

public interface HasNameAndTitles extends HasName {

	String titlePrefix();

	String titleSuffix();

	default String nameOnly(boolean toUpperCase) {
		return NameUtil.nameOnly(this.name(), toUpperCase);
	}

	default String nameFull(boolean toUpperCase) {
		return NameUtil.nameFull(this.name(), toUpperCase, this.titlePrefix(), this.titleSuffix());
	}

}