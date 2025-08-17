package com.rendyrobbani.keuangan.core.domain.entity;

import com.rendyrobbani.keuangan.core.domain.marker.audit.HasCreateMutator;

import java.io.Serializable;

public interface BaseEntity<ID> extends HasCreateMutator, Serializable {

	String TABLE_NAME = null;

	ID id();

}