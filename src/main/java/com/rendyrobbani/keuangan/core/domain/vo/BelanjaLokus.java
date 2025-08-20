package com.rendyrobbani.keuangan.core.domain.vo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum BelanjaLokus {
	TKDD("tkdd", "Transfer ke Daerah dan Dana Desa"),
	BOP("bop", "Bantuan Operasional Penyelenggaraan"),
	BLUD("blud", "Badan Layanan Umum Daerah"),
	PEMPROV("pemprov", "Pemerintah Provinsi"),
	PEMKOT("pemkot", "Pemerintah Kota"),
	PEMKAB("pemkab", "Pemerintah Kabupaten"),
	PEMDES("pemdes", "Pemerintah Desa"),
	SEKOLAH("sekolah", "Sekolah"),
	PARPOL("parpol", "Partai Politik"),
	PAPUA("papua", "Papua"),
	LAINNYA("lainnya", "Lainnya");

	private final String value;

	private final String title;

	public static BelanjaLokus fromValue(String value) {
		if (value != null) for (var e : values()) if (e.value().equals(value)) return e;
		return null;
	}
}