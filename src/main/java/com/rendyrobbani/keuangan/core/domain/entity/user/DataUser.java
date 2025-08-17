package com.rendyrobbani.keuangan.core.domain.entity.user;

import com.rendyrobbani.keuangan.core.domain.entity.DataEntity;
import com.rendyrobbani.keuangan.core.domain.marker.HasNameAndTitles;
import com.rendyrobbani.keuangan.core.domain.marker.HasPangkat;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLock;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLockMutator;
import com.rendyrobbani.keuangan.core.domain.vo.Gender;
import com.rendyrobbani.keuangan.core.domain.vo.Pangkat;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface DataUser extends DataEntity<String>,
                                  HasPangkat,
                                  HasNameAndTitles,
                                  HasLock,
                                  HasLockMutator {

	String TABLE_NAME = "data_user";

	@Override
	String id();

	@Override
	Pangkat pangkat();

	@Override
	String name();

	@Override
	String titlePrefix();

	@Override
	String titleSuffix();

	String password();

	LocalDate dateOfBirth();

	LocalDate dateOfStart();

	Gender gender();

	Short number();

	boolean isPNS();

	boolean isP3K();

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

	void create(String id, Pangkat pangkat, String name, String titlePrefix, String titleSuffix, String password, LocalDate dateOfStart, LocalDateTime createdAt, String createdBy);

	void update(Pangkat pangkat, String name, String titlePrefix, String titleSuffix, String password, LocalDate dateOfStart, LocalDateTime updatedAt, String updatedBy);

}