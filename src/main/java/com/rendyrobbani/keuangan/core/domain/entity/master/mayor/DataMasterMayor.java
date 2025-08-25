package com.rendyrobbani.keuangan.core.domain.entity.master.mayor;

import com.rendyrobbani.keuangan.core.domain.entity.master.DataMasterEntity;
import com.rendyrobbani.keuangan.core.domain.marker.HasNameAndTitles;
import com.rendyrobbani.keuangan.core.domain.vo.JabatanStatus;

import java.time.LocalDateTime;

public interface DataMasterMayor extends DataMasterEntity<Byte>,
                                         HasNameAndTitles {

	String TABLE_NAME = "data_master_mayor";
	Byte ID = 1;

	@Override
	Byte id();

	JabatanStatus status();

	@Override
	String name();

	@Override
	String titlePrefix();

	@Override
	String titleSuffix();

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

	void create(JabatanStatus status, String name, String titlePrefix, String titleSuffix, LocalDateTime createdAt, String createdBy);

	void update(JabatanStatus status, String name, String titlePrefix, String titleSuffix, LocalDateTime updatedAt, String updatedBy);

}