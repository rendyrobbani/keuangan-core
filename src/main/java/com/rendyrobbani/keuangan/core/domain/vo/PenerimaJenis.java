package com.rendyrobbani.keuangan.core.domain.vo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum PenerimaJenis {
	Individu((byte) 3, "Individu/Keluarga", "Individu/Keluarga"),
	BUMN((byte) 9, "BUMN", "Badan Usaha Milik Negara"),
	BUMD((byte) 10, "BUMD", "Badan Usaha Milik Daerah"),
	LKB_BUMN((byte) 11, "LKB-BUMN", "Lembaga Keuangan Bank milik Badan Usaha Milik Negara"),
	LKB_BUMD((byte) 12, "LKB-BUMD", "Lembaga Keuangan Bank milik Badan Usaha Milik Daerah"),
	LKB_BUMS((byte) 13, "LKB-Badan Usaha Milik Swasta", "Lembaga Keuangan Bank milik Badan Usaha Milik Swasta"),
	LKBB_BUMN((byte) 14, "LKBB-BUMN", "Lembaga Keuangan Bukan Bank milik Badan Usaha Milik Negara"),
	LKBB_BUMD((byte) 15, "LKBB-BUMD", "Lembaga Keuangan Bukan Bank milik Badan Usaha Milik Daerah"),
	LKBB_BUMS((byte) 16, "LKBB-Badan Usaha Milik Swasta", "Lembaga Keuangan Bukan Bank milik Badan Usaha Milik Swasta"),
	Parpol((byte) 17, "Partai Politik", "Partai Politik"),
	Lainnya((byte) 4, "Lembaga Lainnya", "Lembaga Lainnya");

	private final Byte value;

	private final String label;

	private final String title;

	public static PenerimaJenis fromValue(Integer value) {
		if (value == null) return null;
		if (value < -127 || value > 127) return null;
		return fromValue(value.byteValue());
	}

	public static PenerimaJenis fromValue(Byte value) {
		if (value != null) for (var e : values()) if (e.value().equals(value)) return e;
		return null;
	}

	public static PenerimaJenis fromValue(String value) {
		if (value != null && value.matches("^\\d*$")) return fromValue(Integer.valueOf(value));
		return null;
	}
}