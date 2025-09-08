package com.rendyrobbani.keuangan.core.domain.repository.budget.common;

import com.rendyrobbani.keuangan.core.domain.entity.budget.common.DataBudgetCommonEntity;
import com.rendyrobbani.keuangan.core.domain.repository.budget.DataBudgetRepository;

public interface DataBudgetCommonRepository<ENTITY extends DataBudgetCommonEntity<ID>, ID> extends DataBudgetRepository<ENTITY, ID> {

}