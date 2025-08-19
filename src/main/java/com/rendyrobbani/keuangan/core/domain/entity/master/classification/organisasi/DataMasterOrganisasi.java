package com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.common.classification.organisasi.OrganisasiClassification;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.entity.user.DataUser;
import com.rendyrobbani.keuangan.core.domain.marker.HasHeadOfOrganisasi;
import com.rendyrobbani.keuangan.core.domain.vo.JabatanStatus;
import com.rendyrobbani.keuangan.core.domain.vo.Pangkat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public interface DataMasterOrganisasi extends DataMasterClassificationEntity,
                                              HasHeadOfOrganisasi {

	String TABLE_NAME = "data_master_organisasi";

	@Override
	String id();

	@Override
	String code();

	@Override
	String name();

	@Override
	boolean isLocked();

	@Override
	LocalDateTime lockedAt();

	@Override
	String lockedBy();

	@Override
	LocalDateTime createdAt();

	@Override
	String createdBy();

	@Override
	LocalDateTime updatedAt();

	@Override
	String updatedBy();

	@Override
	boolean isDeleted();

	@Override
	LocalDateTime deletedAt();

	@Override
	String deletedBy();

	String skpdId();

	String unitId();

	Byte mainBidangIndex();

	default DataMasterBidang mainBidang() {
		if (this.mainBidangIndex() == null) return null;
		if (this.mainBidangIndex() == 1) return this.bidang1();
		if (this.mainBidangIndex() == 2) return this.bidang2();
		if (this.mainBidangIndex() == 3) return this.bidang3();
		return null;
	}

	String bidang1Id();

	DataMasterBidang bidang1();

	String bidang2Id();

	DataMasterBidang bidang2();

	String bidang3Id();

	DataMasterBidang bidang3();

	default List<DataMasterBidang> bidangs() {
		List<DataMasterBidang> bidangs = new ArrayList<>();
		if (this.bidang1() != null) bidangs.add(this.bidang1());
		if (this.bidang2() != null) bidangs.add(this.bidang2());
		if (this.bidang3() != null) bidangs.add(this.bidang3());
		return bidangs;
	}

	@Override
	String headId();


	@Override
	JabatanStatus headStatus();

	DataUser head();

	@Override
	default Pangkat headPangkat() {
		if (this.head() == null) return null;
		return this.head().pangkat();
	}

	@Override
	default String headName() {
		if (this.head() == null) return null;
		return this.head().name();
	}

	@Override
	default String headTitlePrefix() {
		if (this.head() == null) return null;
		return this.head().titlePrefix();
	}

	@Override
	default String headTitleSuffix() {
		if (this.head() == null) return null;
		return this.head().titleSuffix();
	}

	void create(OrganisasiClassification classification, String name, Byte mainBidangIndex, String headId, JabatanStatus headStatus, LocalDateTime createdAt, String createdBy);

	void update(String name, Byte mainBidangIndex, String headId, JabatanStatus headStatus, LocalDateTime updatedAt, String updatedBy);

}