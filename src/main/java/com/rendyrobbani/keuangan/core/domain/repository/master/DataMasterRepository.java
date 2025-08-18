package com.rendyrobbani.keuangan.core.domain.repository.master;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.repository.Repository;

import java.util.List;

public interface DataMasterRepository<ENTITY extends DataMasterEntity<ID>, ID> extends Repository<ENTITY, ID> {

	List<ENTITY> findByIsDeletedFalse();

	List<ENTITY> findByIsDeletedTrue();

}