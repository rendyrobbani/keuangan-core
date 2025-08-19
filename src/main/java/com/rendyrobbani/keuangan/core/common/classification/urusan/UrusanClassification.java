package com.rendyrobbani.keuangan.core.common.classification.urusan;

import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@SuppressWarnings("ClassCanBeRecord")
public final class UrusanClassification {

	private final String urusanCode;

	public static final String REGEX = "^[X1-8]$";

	public static UrusanClassification classify(String code) {
		if (code.matches(REGEX)) throw new RuntimeException("Invalid code");
		return new UrusanClassification(code);
	}

}