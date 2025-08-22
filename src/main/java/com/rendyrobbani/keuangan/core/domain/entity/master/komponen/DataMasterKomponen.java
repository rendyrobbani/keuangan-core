package com.rendyrobbani.keuangan.core.domain.entity.master.komponen;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelompok.DataMasterKelompok;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLock;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLockMutator;
import com.rendyrobbani.keuangan.core.domain.marker.master.classification.kelompok.ReferenceDataMasterKelompok;
import com.rendyrobbani.keuangan.core.domain.vo.KomponenType;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface DataMasterKomponen extends DataMasterEntity<Long>,
                                            HasLock,
                                            HasLockMutator,
                                            ReferenceDataMasterKelompok {

	String TABLE_NAME = "data_master_komponen";

	@Override
	Long id();

	KomponenType type();

	String code();

	String name();

	String spec();

	String unit();

	BigDecimal price();

	boolean isPDN();

	Float tkdnValue();

	@Override
	boolean isLocked();

	@Override
	LocalDateTime lockedAt();

	@Override
	String lockedBy();

	@Override
	LocalDateTime createdAt();

	@Override
	String createdBy();

	@Override
	LocalDateTime updatedAt();

	@Override
	String updatedBy();

	@Override
	boolean isDeleted();

	@Override
	LocalDateTime deletedAt();

	@Override
	String deletedBy();

	@Override
	String kelompokId();

	@Override
	DataMasterKelompok kelompok();

	String rekeningId();

	void create(Long id, KomponenType type, String code, String name, String spec, String unit, BigDecimal price, boolean isPDN, Float tkdnValue, String kelompokId, String rekeningId, LocalDateTime createdAt, String createdBy);

	void update(KomponenType type, String code, String name, String spec, String unit, BigDecimal price, boolean isPDN, Float tkdnValue, String kelompokId, String rekeningId, LocalDateTime updatedAt, String updatedBy);

}