package com.rendyrobbani.keuangan.core.domain.repository.budget;

import com.rendyrobbani.keuangan.core.domain.entity.budget.DataBudgetEntity;
import com.rendyrobbani.keuangan.core.domain.repository.Repository;

public interface DataBudgetRepository<ENTITY extends DataBudgetEntity<ID>, ID> extends Repository<ENTITY, ID> {

}