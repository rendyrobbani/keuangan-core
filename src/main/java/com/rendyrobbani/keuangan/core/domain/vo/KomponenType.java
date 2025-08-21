package com.rendyrobbani.keuangan.core.domain.vo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum KomponenType {
	SSH((byte) 1, "SSH", "Standar Satuan Harga"),
	HSPK((byte) 2, "HSPK", "Harga Satuan Pokok Kegiatan"),
	ASB((byte) 3, "ASB", "Analisis Standar Belanja"),
	SBU((byte) 4, "SBU", "Standar Biaya Umum");

	private final Byte value;

	private final String label;

	private final String title;

	public static KomponenType fromValue(Integer value) {
		if (value == null) return null;
		if (value < -127 || value > 127) return null;
		return fromValue(value.byteValue());
	}

	public static KomponenType fromValue(Byte value) {
		if (value != null) for (var e : values()) if (e.value().equals(value)) return e;
		return null;
	}

	public static KomponenType fromValue(String value) {
		if (value != null && value.matches("^\\d*$")) return fromValue(Integer.valueOf(value));
		return null;
	}
}