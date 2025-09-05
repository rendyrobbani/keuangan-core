package com.rendyrobbani.keuangan.core.domain.repository.budget;

import com.rendyrobbani.keuangan.core.domain.entity.budget.DataBudgetEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.LogsBudgetEntity;
import com.rendyrobbani.keuangan.core.domain.repository.Repository;

public interface LogsBudgetRepository<
		ENTITY extends LogsBudgetEntity<SUBJECT, SUBJECTID>,
		SUBJECT extends DataBudgetEntity<SUBJECTID>,
		SUBJECTID
		>
		extends Repository<ENTITY, Long> {

}