package com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.DataBudgetCommonEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.organisasi.ReferenceSkpd;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.organisasi.ReferenceUnit;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface DataBudgetCommonOrganisasiEntity extends DataBudgetCommonEntity<String>,
                                                          ReferenceSkpd,
                                                          ReferenceUnit {

	@Override
	String id();

	@Override
	String skpdId();

	@Override
	String unitId();

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

}