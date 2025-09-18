package com.rendyrobbani.keuangan.core.domain.repository.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonOrganisasiEntity;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.DataBudgetCommonRepository;

import java.sql.Connection;

public interface DataBudgetCommonOrganisasiRepository<ENTITY extends DataBudgetCommonOrganisasiEntity> extends DataBudgetCommonRepository<ENTITY, String> {

	void deleteAll(Connection connection);

	void updateAll(Connection connection);

}