package com.rendyrobbani.keuangan.core.domain.entity.user;

import com.rendyrobbani.keuangan.core.domain.entity.LogsEntity;
import com.rendyrobbani.keuangan.core.domain.vo.Gender;
import com.rendyrobbani.keuangan.core.domain.vo.Pangkat;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface LogsUser extends LogsEntity<DataUser, String> {

	String TABLE_NAME = "logs_user";

	@Override
	Long id();

	Pangkat pangkat();

	String name();

	String titlePrefix();

	String titleSuffix();

	String password();

	LocalDate dateOfBirth();

	LocalDate dateOfStart();

	Gender gender();

	Short number();

	boolean isPNS();

	boolean isP3K();

	boolean isLocked();

	boolean isDeleted();

	@Override
	LocalDateTime loggedAt();

	@Override
	String loggedBy();

	@Override
	DataUser subject();

	@Override
	String subjectId();

	@Override
	void create(DataUser data, LocalDateTime createdAt, String createdBy);

}