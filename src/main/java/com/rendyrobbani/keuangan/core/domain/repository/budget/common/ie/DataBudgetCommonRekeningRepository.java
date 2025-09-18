package com.rendyrobbani.keuangan.core.domain.repository.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonRekeningEntity;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.DataBudgetCommonRepository;

import java.sql.Connection;

public interface DataBudgetCommonRekeningRepository<ENTITY extends DataBudgetCommonRekeningEntity> extends DataBudgetCommonRepository<ENTITY, String> {

	void deleteAll(Connection connection);

	void updateAll(Connection connection);

}