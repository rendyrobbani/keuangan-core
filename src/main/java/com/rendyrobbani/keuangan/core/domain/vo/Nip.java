package com.rendyrobbani.keuangan.core.domain.vo;

import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Accessors(fluent = true)
public record Nip(String value, LocalDate dateOfBirth, LocalDate dateOfStart, Gender gender, Short number) {

	public static final String REGEX = "^(19[0-9]{2}|20[0-9]{2})(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])(19[0-9]{2}|20[0-9]{2})(0[1-9]|1[0-2]|21)([12])(00[1-9]|[0-9][1-9][0-9]|[1-9][0-9][0-9])$";

	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");

	public static Nip parse(String value) {
		if (!value.matches(REGEX)) throw new RuntimeException("invalid value");
		var dateOfBirth = value.substring(0, 8);
		var dateOfStart = value.substring(8, 14);
		var gender = value.substring(14, 15);
		var number = value.substring(15);
		return new Nip(value,
		               LocalDate.parse(dateOfBirth, FORMATTER),
		               dateOfStart.endsWith("21") ? null : LocalDate.parse(dateOfStart + "01", FORMATTER),
		               Gender.fromValue(gender),
		               Short.valueOf(number)
		);
	}

}