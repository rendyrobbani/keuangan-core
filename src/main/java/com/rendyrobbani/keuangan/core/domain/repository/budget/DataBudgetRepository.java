package com.rendyrobbani.keuangan.core.domain.repository.budget;

import com.rendyrobbani.keuangan.core.domain.entity.budget.DataBudgetEntity;
import com.rendyrobbani.keuangan.core.domain.repository.Repository;

import java.util.List;

public interface DataBudgetRepository<ENTITY extends DataBudgetEntity<ID>, ID> extends Repository<ENTITY, ID> {

	List<ENTITY> findByIsDeletedFalse();

	List<ENTITY> findByIsDeletedTrue();

}