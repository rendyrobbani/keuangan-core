package com.rendyrobbani.keuangan.core.domain.repository.budget;

import com.rendyrobbani.keuangan.core.domain.entity.budget.DataBudgetEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.LogsBudgetEntity;
import com.rendyrobbani.keuangan.core.domain.repository.Repository;

import java.util.List;

public interface LogsBudgetRepository<ENTITY extends LogsBudgetEntity<SUBJECT, SUBJECTID>, SUBJECT extends DataBudgetEntity<SUBJECTID>, SUBJECTID> extends Repository<ENTITY, Long> {

	List<ENTITY> findBySubjectId(SUBJECTID subjectId);

	List<ENTITY> findBySubjectIdAndIsDeletedFalse(SUBJECTID subjectId);

	List<ENTITY> findBySubjectIdAndIsDeletedTrue(SUBJECTID subjectId);

}