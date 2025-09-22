package com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.belanja.subkegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonSubkegiatanEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.bidang.DataMasterBidang;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.fungsi.DataMasterFungsi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kegiatan.DataMasterKegiatan;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subkegiatan.DataMasterSubkegiatan;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.program.DataMasterProgram;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.subfungsi.DataMasterSubfungsi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.urusan.DataMasterUrusan;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLock;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLockMutator;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface DataBudgetCommonExpendBelanjaSubkegiatan extends DataBudgetCommonSubkegiatanEntity,
                                                                  HasLock,
                                                                  HasLockMutator {

	String TABLE_NAME = "data_budget_common_expend_belanja_subkegiatan";

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

	@Override
	String kegiatanId();

	@Override
	String subkegiatanId();

	@Override
	String fungsiId();

	@Override
	String subfungsiId();

	@Override
	BigDecimal sebelum();

	@Override
	BigDecimal total();

	@Override
	boolean isLocked();

	@Override
	LocalDateTime lockedAt();

	@Override
	String lockedBy();

	boolean isRincianLocked();

	LocalDateTime rincianlockedAt();

	String rincianlockedBy();

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

	@Override
	DataMasterKegiatan kegiatan();

	@Override
	DataMasterSubkegiatan subkegiatan();

	@Override
	DataMasterFungsi fungsi();

	@Override
	DataMasterSubfungsi subfungsi();

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