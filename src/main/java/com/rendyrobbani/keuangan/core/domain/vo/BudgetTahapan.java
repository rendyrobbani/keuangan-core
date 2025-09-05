package com.rendyrobbani.keuangan.core.domain.vo;

import java.util.List;

public enum BudgetTahapan {
	RKPD_MURNI_RANCANGAN(
			1L,
			1L,
			"RKPD"
	),
	RKPD_MURNI_EVALUASI(
			2L,
			1L,
			"Penyesuaian Hasil Fasilitasi RKPD"
	),
	RKPD_MURNI_PENETAPAN(
			3L,
			1L,
			"Penetapan RKPD"
	),
	PPAS_MURNI_RANCANGAN(
			4L,
			2L,
			"KUA dan PPAS"
	),
	PPAS_MURNI_EVALUASI(
			5L,
			2L,
			"Penyesuaian Hasil Evaluasi Rancangan KUA dan PPAS"
	),
	PPAS_MURNI_PENETAPAN(
			6L,
			40L,
			"Penetapan KUA dan PPAS"
	),
	APBD_MURNI_RANCANGAN(
			7L,
			5L,
			"Rancangan APBD"
	),
	APBD_MURNI_EVALUASI(
			8L,
			27L,
			"Penyesuaian Hasil Evaluasi Rancangan APBD"
	),
	APBD_MURNI_PENETAPAN(
			9L,
			28L,
			"Penetapan APBD"
	),
	APBD_MURNI_PERGESERAN_RANCANGAN(
			10L,
			7L,
			"Pergeseran APBD"
	),
	APBD_MURNI_PERGESERAN_PENETAPAN(
			11L,
			30L,
			"Penetapan Pergeseran APBD"
	),
	RKPD_PERUBAHAN_RANCANGAN(
			12L,
			3L,
			"Perubahan RKPD"
	),
	RKPD_PERUBAHAN_EVALUASI(
			13L,
			3L,
			"Penyesuaian Hasil Fasilitasi Perubahan RKPD"
	),
	RKPD_PERUBAHAN_PENETAPAN(
			14L,
			3L,
			"Penetapan Perubahan RKPD"
	),
	PPAS_PERUBAHAN_RANCANGAN(
			15L,
			4L,
			"Perubahan KUA dan PPAS"
	),
	PPAS_PERUBAHAN_EVALUASI(
			16L,
			4L,
			"Penyesuaian Hasil Evaluasi Rancangan Perubahan KUA dan PPAS"
	),
	PPAS_PERUBAHAN_PENETAPAN(
			17L,
			41L,
			"Penetapan Perubahan KUA dan PPAS"
	),
	APBD_PERUBAHAN_RANCANGAN(
			18L,
			8L,
			"Rancangan Perubahan APBD"
	),
	APBD_PERUBAHAN_EVALUASI(
			19L,
			25L,
			"Penyesuaian Hasil Evaluasi Rancangan Perubahan APBD"
	),
	APBD_PERUBAHAN_PENETAPAN(
			20L,
			29L,
			"Penetapan Perubahan APBD"
	),
	APBD_PERUBAHAN_PERGESERAN_RANCANGAN(
			21L,
			31L,
			"Pergeseran APBD setelah Perubahan APBD"
	),
	APBD_PERUBAHAN_PERGESERAN_PENETAPAN(
			22L,
			32L,
			"Penetapan Pergeseran APBD setelah Perubahan APBD"
	);

	private final Long id;

	private final Long idSIPD;

	private final String nama;

	BudgetTahapan(Long id, Long idSIPD, String nama) {
		this.id = id;
		this.idSIPD = idSIPD;
		this.nama = nama;
	}

	public Long id() {
		return this.id;
	}

	public Long idSIPD() {
		return this.idSIPD;
	}

	public String nama() {
		return this.nama;
	}

	public Boolean isRKPDMurni() {
		return List.of(RKPD_MURNI_RANCANGAN, RKPD_MURNI_RANCANGAN, RKPD_MURNI_RANCANGAN).contains(this);
	}

	public Boolean isRKPDPerubahan() {
		return List.of(RKPD_PERUBAHAN_RANCANGAN, RKPD_PERUBAHAN_RANCANGAN, RKPD_PERUBAHAN_RANCANGAN).contains(this);
	}

	public Boolean isPPASMurni() {
		return List.of(PPAS_MURNI_RANCANGAN, PPAS_MURNI_RANCANGAN, PPAS_MURNI_RANCANGAN).contains(this);
	}

	public Boolean isPPASPerubahan() {
		return List.of(PPAS_PERUBAHAN_RANCANGAN, PPAS_PERUBAHAN_RANCANGAN, PPAS_PERUBAHAN_RANCANGAN).contains(this);
	}

	public Boolean isAPBDMurni() {
		return List.of(APBD_MURNI_RANCANGAN, APBD_MURNI_RANCANGAN, APBD_MURNI_RANCANGAN).contains(this);
	}

	public Boolean isAPBDPerubahan() {
		return List.of(APBD_PERUBAHAN_RANCANGAN, APBD_PERUBAHAN_RANCANGAN, APBD_PERUBAHAN_RANCANGAN).contains(this);
	}

	public Boolean isPergeseranMurni() {
		return List.of(APBD_MURNI_PERGESERAN_RANCANGAN, APBD_MURNI_PERGESERAN_PENETAPAN).contains(this);
	}

	public Boolean isPergeseranPerubahan() {
		return List.of(APBD_PERUBAHAN_PERGESERAN_RANCANGAN, APBD_PERUBAHAN_PERGESERAN_PENETAPAN).contains(this);
	}

	public Boolean isRKPD() {
		return this.isRKPDMurni() || this.isRKPDPerubahan();
	}

	public Boolean isPPAS() {
		return this.isPPASMurni() || this.isPPASPerubahan();
	}

	public Boolean isAPBD() {
		return this.isAPBDMurni() || this.isAPBDPerubahan();
	}

	public Boolean isMurni() {
		return this.isRKPDMurni() || this.isPPASMurni() || this.isAPBDMurni();
	}

	public Boolean isPergeseran() {
		return this.isPergeseranMurni() || this.isPergeseranPerubahan();
	}

	public Boolean isPerubahan() {
		return this.isRKPDPerubahan() || this.isPPASPerubahan() || this.isAPBDPerubahan();
	}

	public Boolean isPerda() {
		return List.of(APBD_MURNI_PENETAPAN, APBD_PERUBAHAN_PENETAPAN).contains(this);
	}

	public Boolean isPerkada() {
		return List.of(RKPD_MURNI_PENETAPAN, APBD_MURNI_PENETAPAN, APBD_MURNI_PERGESERAN_PENETAPAN, RKPD_PERUBAHAN_PENETAPAN, APBD_PERUBAHAN_PENETAPAN, APBD_PERUBAHAN_PERGESERAN_PENETAPAN).contains(this);
	}

	public static BudgetTahapan fromId(Long id) {
		if (id == null) return null;
		for (var e : values()) if (id.equals(e.id)) return e;
		return null;
	}

	public static List<BudgetTahapan> nextTahapan(BudgetTahapan lastTahapan) {
		if (lastTahapan != null) {
			return switch (lastTahapan) {
				case RKPD_MURNI_RANCANGAN -> List.of(RKPD_MURNI_RANCANGAN, RKPD_MURNI_EVALUASI);
				case RKPD_MURNI_EVALUASI -> List.of(RKPD_MURNI_EVALUASI, RKPD_MURNI_PENETAPAN);
				case RKPD_MURNI_PENETAPAN -> List.of(PPAS_MURNI_RANCANGAN);
				case PPAS_MURNI_RANCANGAN -> List.of(PPAS_MURNI_RANCANGAN, PPAS_MURNI_EVALUASI);
				case PPAS_MURNI_EVALUASI -> List.of(PPAS_MURNI_EVALUASI, PPAS_MURNI_PENETAPAN);
				case PPAS_MURNI_PENETAPAN -> List.of(APBD_MURNI_RANCANGAN);
				case APBD_MURNI_RANCANGAN -> List.of(APBD_MURNI_RANCANGAN, APBD_MURNI_EVALUASI);
				case APBD_MURNI_EVALUASI -> List.of(APBD_MURNI_EVALUASI, APBD_MURNI_PENETAPAN);
				case APBD_MURNI_PENETAPAN -> List.of(APBD_MURNI_PERGESERAN_RANCANGAN);
				case APBD_MURNI_PERGESERAN_RANCANGAN -> List.of(APBD_MURNI_PERGESERAN_RANCANGAN, APBD_MURNI_PERGESERAN_PENETAPAN);
				case APBD_MURNI_PERGESERAN_PENETAPAN -> List.of(APBD_MURNI_PERGESERAN_RANCANGAN, RKPD_PERUBAHAN_RANCANGAN);
				case RKPD_PERUBAHAN_RANCANGAN -> List.of(RKPD_PERUBAHAN_RANCANGAN, RKPD_PERUBAHAN_EVALUASI);
				case RKPD_PERUBAHAN_EVALUASI -> List.of(RKPD_PERUBAHAN_EVALUASI, RKPD_PERUBAHAN_PENETAPAN);
				case RKPD_PERUBAHAN_PENETAPAN -> List.of(PPAS_PERUBAHAN_RANCANGAN);
				case PPAS_PERUBAHAN_RANCANGAN -> List.of(PPAS_PERUBAHAN_RANCANGAN, PPAS_PERUBAHAN_EVALUASI);
				case PPAS_PERUBAHAN_EVALUASI -> List.of(PPAS_PERUBAHAN_EVALUASI, PPAS_PERUBAHAN_PENETAPAN);
				case PPAS_PERUBAHAN_PENETAPAN -> List.of(APBD_PERUBAHAN_RANCANGAN);
				case APBD_PERUBAHAN_RANCANGAN -> List.of(APBD_PERUBAHAN_RANCANGAN, APBD_PERUBAHAN_EVALUASI);
				case APBD_PERUBAHAN_EVALUASI -> List.of(APBD_PERUBAHAN_EVALUASI, APBD_PERUBAHAN_PENETAPAN);
				case APBD_PERUBAHAN_PENETAPAN -> List.of(APBD_PERUBAHAN_PERGESERAN_RANCANGAN);
				case APBD_PERUBAHAN_PERGESERAN_RANCANGAN -> List.of(APBD_PERUBAHAN_PERGESERAN_RANCANGAN, APBD_PERUBAHAN_PERGESERAN_PENETAPAN);
				case APBD_PERUBAHAN_PERGESERAN_PENETAPAN -> List.of(APBD_PERUBAHAN_PERGESERAN_RANCANGAN);
			};
		}
		return List.of(RKPD_MURNI_RANCANGAN);
	}
}