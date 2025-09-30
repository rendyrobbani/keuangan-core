package com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.expend.belanja.subkegiatan;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.SipdBudgetCommonSubkegiatanEntity;

import java.time.LocalDateTime;

public interface SipdBudgetCommonExpendBelanjaSubkegiatan extends SipdBudgetCommonSubkegiatanEntity<DataBudgetCommonExpendBelanjaSubkegiatan> {

	String TABLE_NAME = "sipd_budget_common_expend_belanja_subkegiatan";

	@Override
	Long id();

	Long unitId();

	String unitCode();

	Long skpdId();

	String skpdCode();

	Long unitSkpdId();

	String unitSkpdCode();

	Long urusanId();

	String urusanCode();

	Long bidangId();

	String bidangCode();

	Long programId();

	String programCode();

	Long kegiatanId();

	String kegiatanCode();

	Long subkegiatanId();

	String subkegiatanCode();

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
	DataBudgetCommonExpendBelanjaSubkegiatan subject();

	@Override
	String subjectId();

}