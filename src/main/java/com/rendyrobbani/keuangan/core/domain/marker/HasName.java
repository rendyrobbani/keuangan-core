package com.rendyrobbani.keuangan.core.domain.marker;

import com.rendyrobbani.keuangan.core.common.util.name.NameUtil;

public interface HasName {

	String name();

	default String name(boolean toUpperCase) {
		return NameUtil.nameOnly(this.name(), toUpperCase);
	}

}