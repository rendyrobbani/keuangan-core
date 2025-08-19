package com.rendyrobbani.keuangan.core.domain.marker;

import com.rendyrobbani.keuangan.core.common.util.name.NameUtil;
import com.rendyrobbani.keuangan.core.domain.vo.JabatanStatus;
import com.rendyrobbani.keuangan.core.domain.vo.Pangkat;

public interface HasHeadOfOrganisasi extends HasName {

	String headId();

	JabatanStatus headStatus();

	Pangkat headPangkat();

	String headName();

	default String headNameOnly(boolean toUpperCase) {
		return NameUtil.nameOnly(this.headName(), toUpperCase);
	}

	default String headNameFull(boolean toUpperCase) {
		return NameUtil.nameFull(this.headName(), toUpperCase, this.headTitlePrefix(), this.headTitleSuffix());
	}

	String headTitlePrefix();

	String headTitleSuffix();

	default String headTitle() {
		String jabatan = "Kepala " + this.name();
		jabatan = jabatan.replace("Kepala Sekretariat", "Sekretaris");
		jabatan = jabatan.replace("Kepala Inspektorat", "Inspektur");
		jabatan = jabatan.replace("Kepala Kecamatan", "Camat");
		jabatan = jabatan.replace("Kepala Kelurahan", "Lurah");
		jabatan = jabatan.replace("Kepala Badan Penanggulangan Bencana Daerah", "Kepala Pelaksana Badan Penanggulangan Bencana Daerah");
		jabatan = jabatan.replace("Kepala Rumah Sakit", "Direktur Rumah Sakit");
		return jabatan;
	}

}