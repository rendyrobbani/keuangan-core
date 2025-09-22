package com.rendyrobbani.keuangan.core.domain.repository.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonOrganisasiEntity;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.DataBudgetCommonRepository;

import java.sql.Connection;
import java.time.LocalDateTime;

public interface DataBudgetCommonOrganisasiRepository<ENTITY extends DataBudgetCommonOrganisasiEntity> extends DataBudgetCommonRepository<ENTITY, String> {

	void deleteAll(Connection connection, LocalDateTime deletedAt, String deletedBy);

	void updateAll(Connection connection, LocalDateTime updatedAt, String updatedBy);

	void deleteBySkpdId(Connection connection, LocalDateTime deletedAt, String deletedBy, String skpdId);

	void updateBySkpdId(Connection connection, LocalDateTime updatedAt, String updatedBy, String skpdId);

	void deleteByUnitId(Connection connection, LocalDateTime deletedAt, String deletedBy, String unitId);

	void updateByUnitId(Connection connection, LocalDateTime updatedAt, String updatedBy, String unitId);

}