package com.rendyrobbani.keuangan.core.domain.vo.classification.fungsi;

import com.rendyrobbani.keuangan.core.common.util.regex.RegexUtil;
import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@SuppressWarnings("ClassCanBeRecord")
public final class SubfungsiClassification {

	private final String fungsiCode;

	private final String subfungsiCode;

	public static final String REGEX = "^(\\d{2})\\.(\\d{2})$";

	public static SubfungsiClassification parse(String code) {
		if (!code.matches(REGEX)) throw new RuntimeException("Invalid code");
		var groups = RegexUtil.groups(code, REGEX);
		return new SubfungsiClassification(String.join(".", groups.subList(0, 1)),
		                                   String.join(".", groups.subList(0, 2)));
	}

}