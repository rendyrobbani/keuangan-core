package com.rendyrobbani.keuangan.core.common.classification.fungsi;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@SuppressWarnings("ClassCanBeRecord")
public final class FungsiClassification {

	private final String fungsiCode;

	public static final String REGEX = "^(?!00.*$)(\\d{2})$";

	public static FungsiClassification classify(String code) {
		if (code.matches(REGEX)) throw new RuntimeException("Invalid code");
		return new FungsiClassification(code);
	}

}