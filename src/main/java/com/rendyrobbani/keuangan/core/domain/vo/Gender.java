package com.rendyrobbani.keuangan.core.domain.vo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum Gender {
	LAKI_LAKI((byte) 1, "Laki-laki"),
	PEREMPUAN((byte) 2, "Perempuan");

	private final Byte value;

	private final String title;

	public static Gender fromValue(Integer value) {
		if (value == null) return null;
		if (value < -127 || value > 127) return null;
		return fromValue(value.byteValue());
	}

	public static Gender fromValue(Byte value) {
		if (value != null) for (var e : values()) if (e.value().equals(value)) return e;
		return null;
	}

	public static Gender fromValue(String value) {
		if (value != null && value.matches("^\\d*$")) return fromValue(Integer.valueOf(value));
		return null;
	}
}