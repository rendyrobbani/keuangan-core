package com.rendyrobbani.keuangan.core.domain.repository.budget.common.ie;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie.DataBudgetCommonRekeningEntity;
import com.rendyrobbani.keuangan.core.domain.repository.budget.common.DataBudgetCommonRepository;

import java.sql.Connection;
import java.time.LocalDateTime;

public interface DataBudgetCommonRekeningRepository<ENTITY extends DataBudgetCommonRekeningEntity> extends DataBudgetCommonRepository<ENTITY, String> {

	void deleteAll(Connection connection, LocalDateTime deletedAt, String deletedBy);

	void updateAll(Connection connection, LocalDateTime updatedAt, String updatedBy);

	void deleteBySkpdId(Connection connection, LocalDateTime deletedAt, String deletedBy, String skpdId);

	void updateBySkpdId(Connection connection, LocalDateTime updatedAt, String updatedBy, String skpdId);

	void deleteByUnitId(Connection connection, LocalDateTime deletedAt, String deletedBy, String unitId);

	void updateByUnitId(Connection connection, LocalDateTime updatedAt, String updatedBy, String unitId);

	void deleteByUnitIdAndBidangId(Connection connection, LocalDateTime deletedAt, String deletedBy, String unitId, String bidangId);

	void updateByUnitIdAndBidangId(Connection connection, LocalDateTime updatedAt, String updatedBy, String unitId, String bidangId);

	void deleteByUnitIdAndBidangIdAndRekeningId(Connection connection, LocalDateTime deletedAt, String deletedBy, String unitId, String bidangId, String rekeningId);

	void updateByUnitIdAndBidangIdAndRekeningId(Connection connection, LocalDateTime updatedAt, String updatedBy, String unitId, String bidangId, String rekeningId);

}