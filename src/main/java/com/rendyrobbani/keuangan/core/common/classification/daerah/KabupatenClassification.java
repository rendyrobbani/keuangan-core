package com.rendyrobbani.keuangan.core.common.classification.daerah;

import com.rendyrobbani.keuangan.core.common.util.regex.RegexUtil;
import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@SuppressWarnings("ClassCanBeRecord")
public final class KabupatenClassification {

	private final String provinsiCode;

	private final String kabupatenCode;

	public static final String REGEX = "^(?!00.*|.{2}.00.*$)(\\d{2})\\.(?!00$)(\\d{2})$";

	public static KabupatenClassification classify(String code) {
		if (!code.matches(REGEX)) throw new RuntimeException("Invalid code");
		var groups = RegexUtil.groups(code, REGEX);
		return new KabupatenClassification(String.join(".", groups.subList(0, 1)),
		                                   String.join(".", groups.subList(0, 2)));
	}

}