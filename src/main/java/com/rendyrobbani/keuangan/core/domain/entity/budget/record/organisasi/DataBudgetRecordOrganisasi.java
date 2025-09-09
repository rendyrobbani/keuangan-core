package com.rendyrobbani.keuangan.core.domain.entity.budget.record.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal.DataBudgetJadwal;
import com.rendyrobbani.keuangan.core.domain.entity.budget.record.DataBudgetRecordEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.user.DataUser;
import com.rendyrobbani.keuangan.core.domain.marker.HasHeadOfOrganisasi;
import com.rendyrobbani.keuangan.core.domain.vo.JabatanStatus;
import com.rendyrobbani.keuangan.core.domain.vo.Pangkat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public interface DataBudgetRecordOrganisasi extends DataBudgetRecordEntity<DataMasterOrganisasi, String>,
                                                    HasHeadOfOrganisasi {

	String TABLE_NAME = "data_budget_record_organisasi";

	@Override
	String id();

	@Override
	Long jadwalId();

	@Override
	DataBudgetJadwal jadwal();

	@Override
	String commonId();

	@Override
	DataMasterOrganisasi common();

	String code();

	String name();

	boolean isSkpd();

	boolean isUnit();

	boolean isSetda();

	boolean isSkpkd();

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

	String headId();

	JabatanStatus headStatus();

	DataUser head();

	Pangkat headPangkat();

	String headName();

	String headTitlePrefix();

	String headTitleSuffix();

	DataBudgetRecordOrganisasi skpd();

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

}