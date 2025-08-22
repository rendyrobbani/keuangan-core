package com.rendyrobbani.keuangan.core.domain.repository.master.priority;

import com.rendyrobbani.keuangan.core.domain.entity.master.priority.DataMasterPriorityEntity;
import com.rendyrobbani.keuangan.core.domain.repository.master.DataMasterRepository;

import java.util.List;

public interface DataMasterPriorityRepository<ENTITY extends DataMasterPriorityEntity> extends DataMasterRepository<ENTITY, Long> {

	List<ENTITY> findByYear(Short year);

	List<ENTITY> findByYearAndIsDeletedFalse(Short year);

	List<ENTITY> findByYearAndIsDeletedTrue(Short year);

}