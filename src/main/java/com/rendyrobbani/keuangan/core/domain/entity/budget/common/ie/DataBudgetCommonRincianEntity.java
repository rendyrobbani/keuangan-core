package com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie;

import com.rendyrobbani.keuangan.core.common.util.koefisien.KoefisienUtil;
import com.rendyrobbani.keuangan.core.domain.entity.budget.common.DataBudgetCommonEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening1.DataMasterRekening1;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening2.DataMasterRekening2;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening3.DataMasterRekening3;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening4.DataMasterRekening4;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening5.DataMasterRekening5;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening6.DataMasterRekening6;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.DataMasterUrusan;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.bidang.ReferenceDataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.organisasi.ReferenceSkpd;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.organisasi.ReferenceUnit;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening1.ReferenceDataMasterRekening1;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening2.ReferenceDataMasterRekening2;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening3.ReferenceDataMasterRekening3;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening4.ReferenceDataMasterRekening4;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening5.ReferenceDataMasterRekening5;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.rekening.base.rekening6.ReferenceDataMasterRekening6;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.urusan.ReferenceDataMasterUrusan;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface DataBudgetCommonRincianEntity extends DataBudgetCommonEntity<Long>,
                                                       ReferenceSkpd,
                                                       ReferenceUnit,
                                                       ReferenceDataMasterUrusan,
                                                       ReferenceDataMasterBidang,
                                                       ReferenceDataMasterRekening1,
                                                       ReferenceDataMasterRekening2,
                                                       ReferenceDataMasterRekening3,
                                                       ReferenceDataMasterRekening4,
                                                       ReferenceDataMasterRekening5,
                                                       ReferenceDataMasterRekening6 {

	@Override
	Long id();

	@Override
	String skpdId();

	@Override
	String unitId();

	@Override
	String urusanId();

	@Override
	String bidangId();

	@Override
	String rekening1Id();

	@Override
	String rekening2Id();

	@Override
	String rekening3Id();

	@Override
	String rekening4Id();

	@Override
	String rekening5Id();

	@Override
	String rekening6Id();

	String description();

	String information();

	BigDecimal volume1();

	String satuan1();

	default String koefisien1() {
		return KoefisienUtil.from(this.volume1(), this.satuan1());
	}

	BigDecimal volume2();

	String satuan2();

	default String koefisien2() {
		return KoefisienUtil.from(this.volume2(), this.satuan2());
	}

	BigDecimal volume3();

	String satuan3();

	default String koefisien3() {
		return KoefisienUtil.from(this.volume3(), this.satuan3());
	}

	BigDecimal volume4();

	String satuan4();

	default String koefisien4() {
		return KoefisienUtil.from(this.volume4(), this.satuan4());
	}

	BigDecimal volume();

	String satuan();

	BigDecimal price();

	BigDecimal total();

	BigDecimal sebelum();

	default BigDecimal setelah() {
		return this.total();
	}

	default BigDecimal selisih() {
		BigDecimal sebelum = this.sebelum() != null ? this.sebelum() : BigDecimal.ZERO;
		BigDecimal setelah = this.setelah() != null ? this.setelah() : BigDecimal.ZERO;
		return setelah.subtract(sebelum);
	}

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

	@Override
	DataMasterOrganisasi skpd();

	@Override
	DataMasterOrganisasi unit();

	@Override
	DataMasterUrusan urusan();

	@Override
	DataMasterBidang bidang();

	@Override
	DataMasterRekening1 rekening1();

	@Override
	DataMasterRekening2 rekening2();

	@Override
	DataMasterRekening3 rekening3();

	@Override
	DataMasterRekening4 rekening4();

	@Override
	DataMasterRekening5 rekening5();

	@Override
	DataMasterRekening6 rekening6();

}