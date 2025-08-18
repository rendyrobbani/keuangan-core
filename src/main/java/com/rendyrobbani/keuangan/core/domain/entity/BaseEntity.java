package com.rendyrobbani.keuangan.core.domain.entity;

import java.io.Serializable;

public interface BaseEntity<ID> extends Serializable {

	String TABLE_NAME = null;

	ID id();

}