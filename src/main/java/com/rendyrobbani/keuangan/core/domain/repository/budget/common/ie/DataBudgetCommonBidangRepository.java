package com.rendyrobbani.keuangan.core.domain.repository.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonBidangEntity;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.DataBudgetCommonRepository;

import java.sql.Connection;

public interface DataBudgetCommonBidangRepository<ENTITY extends DataBudgetCommonBidangEntity> extends DataBudgetCommonRepository<ENTITY, String> {

	void deleteAll(Connection connection);

	void updateAll(Connection connection);

}