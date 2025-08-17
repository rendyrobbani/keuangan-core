package com.rendyrobbani.keuangan.core.domain.repository;

import com.rendyrobbani.keuangan.core.domain.entity.BaseEntity;

import java.util.List;

public interface Repository<ENTITY extends BaseEntity<ID>, ID> {

	List<ENTITY> findAll();

	ENTITY findById(ID id);

	ENTITY save(ENTITY entity);

	void deleteAll();

	ENTITY deleteById(ID id);

}