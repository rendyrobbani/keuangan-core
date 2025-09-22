package com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.belanja.program;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonProgramEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.program.DataMasterProgram;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.DataMasterUrusan;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface DataBudgetCommonExpendBelanjaProgram extends DataBudgetCommonProgramEntity {

	String TABLE_NAME = "data_budget_common_expend_belanja_program";

	@Override
	String id();

	@Override
	String skpdId();

	@Override
	String unitId();

	@Override
	String urusanId();

	@Override
	String bidangId();

	@Override
	String programId();

	String programCode();

	@Override
	BigDecimal sebelum();

	@Override
	BigDecimal total();

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
	DataMasterProgram program();

	BigDecimal belanjaOperasiSebelum();

	BigDecimal belanjaModalSebelum();

	BigDecimal belanjaTidakTerdugaSebelum();

	BigDecimal belanjaTransferSebelum();

	BigDecimal belanjaOperasi();

	BigDecimal belanjaModal();

	BigDecimal belanjaTidakTerduga();

	BigDecimal belanjaTransfer();

	default BigDecimal belanjaOperasiSetelah() {
		return this.belanjaOperasi();
	}

	default BigDecimal belanjaModalSetelah() {
		return this.belanjaModal();
	}

	default BigDecimal belanjaTidakTerdugaSetelah() {
		return this.belanjaTidakTerduga();
	}

	default BigDecimal belanjaTransferSetelah() {
		return this.belanjaTransfer();
	}

}