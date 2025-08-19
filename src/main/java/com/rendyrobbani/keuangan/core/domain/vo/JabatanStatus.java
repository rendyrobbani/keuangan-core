package com.rendyrobbani.keuangan.core.domain.vo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum JabatanStatus {
	DEFINITIF((byte) 1, null, "Definitif"),
	PJ((byte) 2, "Pj.", "Penjabat"),
	PJS((byte) 3, "Pjs.", "Penjabat Sementara"),
	PLT((byte) 4, "Plt.", "Pelaksana Tugas"),
	PLH((byte) 5, "Plh.", "Pelaksana Harian");

	private final Byte value;

	private final String label;

	private final String title;

	public static JabatanStatus fromValue(Integer value) {
		if (value == null) return null;
		if (value < -127 || value > 127) return null;
		return fromValue(value.byteValue());
	}

	public static JabatanStatus fromValue(Byte value) {
		if (value != null) for (var e : values()) if (e.value().equals(value)) return e;
		return null;
	}

	public static JabatanStatus fromValue(String value) {
		if (value != null && value.matches("^\\d*$")) return fromValue(Integer.valueOf(value));
		return null;
	}
}