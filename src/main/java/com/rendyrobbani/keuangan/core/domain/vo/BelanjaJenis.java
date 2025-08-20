package com.rendyrobbani.keuangan.core.domain.vo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum BelanjaJenis {
	GAJI("BTL-GAJI", "Belanja Gaji dan Tunjangan ASN"),
	BARJAS_MODAL("BARJAS-MODAL", "Belanja Barang Jasa dan Modal"),
	BUNGA("BUNGA", "Belanja Bunga"),
	SUBSIDI("SUBSIDI", "Belanja Subsidi"),
	HIBAH_BARANG("HIBAH-BRG", "Belanja Hibah (Barang/Jasa)"),
	HIBAH_UANG("HIBAH", "Belanja Hibah (Uang)"),
	BANSOS_BARANG("BANSOS-BRG", "Belanja Bantuan Sosial (Barang/Jasa)"),
	BANSOS_UANG("BANSOS", "Belanja Bantuan Sosial (Uang)"),
	BAGI_HASIL("BAGI-HASIL", "Belanja Bagi Hasil"),
	BANKEU_UMUM("BANKEU", "Belanja Bantuan Keuangan Umum"),
	BANKEU_KHUSUS("BANKEU-KHUSUS", "Belanja Bantuan Keuangan Khusus"),
	BTT("BTT", "Belanja Tidak Terduga (BTT)"),
	BOS("BOS", "Dana BOS (BOS Pusat)"),
	BLUD("BLUD", "Belanja Operasional (BLUD)"),
	TANAH("TANAH", "Pembebasan Tanah/Lahan");

	private final String value;

	private final String title;

	public static BelanjaJenis fromValue(String value) {
		if (value != null) for (var e : values()) if (e.value().equals(value)) return e;
		return null;
	}
}