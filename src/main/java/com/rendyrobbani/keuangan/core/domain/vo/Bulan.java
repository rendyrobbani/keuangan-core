package com.rendyrobbani.keuangan.core.domain.vo;

public enum Bulan {
	JANUARI((byte) 1, "Januari"),
	FEBRUARI((byte) 2, "Februari"),
	MARET((byte) 3, "Maret"),
	APRIL((byte) 4, "April"),
	MEI((byte) 5, "Mei"),
	JUNI((byte) 6, "Juni"),
	JULI((byte) 7, "Juli"),
	AGUSTUS((byte) 8, "Agustus"),
	SEPTEMBER((byte) 9, "September"),
	OKTOBER((byte) 10, "Oktober"),
	NOVEMBER((byte) 11, "November"),
	DESEMBER((byte) 12, "Desember");

	private final Byte id;

	private final String nama;

	Bulan(Byte id, String nama) {
		this.id = id;
		this.nama = nama;
	}

	public Byte id() {
		return this.id;
	}

	public String nama() {
		return this.nama;
	}

	public static Bulan fromId(Byte id) {
		if (id == null) return null;
		for (Bulan e : Bulan.values()) if (id.equals(e.id)) return e;
		return null;
	}

	public static Bulan fromNama(String nama) {
		if (nama == null) return null;
		for (Bulan e : Bulan.values()) if (nama.equalsIgnoreCase(e.nama)) return e;
		return null;
	}
}