package com.rendyrobbani.keuangan.core.domain.vo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum UraianType {
	PAKET((byte) 1, "Paket Pekerjaan"),
	KELOMPOK((byte) 2, "Pengelompokan Belanja");

	private final Byte value;

	private final String title;

	public static UraianType fromValue(Integer value) {
		if (value == null) return null;
		if (value < -127 || value > 127) return null;
		return fromValue(value.byteValue());
	}

	public static UraianType fromValue(Byte value) {
		if (value != null) for (var e : values()) if (e.value().equals(value)) return e;
		return null;
	}

	public static UraianType fromValue(String value) {
		if (value != null && value.matches("^\\d*$")) return fromValue(Integer.valueOf(value));
		return null;
	}
}