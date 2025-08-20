package com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.LogsMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.entity.user.DataUser;
import com.rendyrobbani.keuangan.core.domain.marker.HasHeadOfOrganisasi;
import com.rendyrobbani.keuangan.core.domain.vo.JabatanStatus;
import com.rendyrobbani.keuangan.core.domain.vo.Pangkat;

import java.time.LocalDateTime;

public interface LogsMasterOrganisasi extends LogsMasterClassificationEntity<DataMasterOrganisasi>,
                                              HasHeadOfOrganisasi {

	String TABLE_NAME = "logs_master_organisasi";

	@Override
	Long id();

	String code();

	String name();

	@Override
	boolean isLocked();

	@Override
	boolean isDeleted();

	String skpdId();

	String unitId();

	Byte mainBidangIndex();

	String bidang1Id();

	DataMasterBidang bidang1();

	String bidang2Id();

	DataMasterBidang bidang2();

	String bidang3Id();

	DataMasterBidang bidang3();

	@Override
	JabatanStatus headStatus();

	@Override
	String headId();

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

	@Override
	LocalDateTime loggedAt();

	@Override
	String loggedBy();

	@Override
	DataMasterOrganisasi subject();

	@Override
	String subjectId();

	@Override
	void create(DataMasterOrganisasi data, LocalDateTime createdAt, String createdBy);

}