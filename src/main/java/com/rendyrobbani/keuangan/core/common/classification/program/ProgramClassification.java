package com.rendyrobbani.keuangan.core.common.classification.program;

import com.rendyrobbani.keuangan.core.common.util.regex.RegexUtil;
import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@SuppressWarnings("ClassCanBeRecord")
public final class ProgramClassification {

	private final String urusanCode;

	private final String bidangCode;

	private final String programCode;

	public static final String REGEX = "^(?!X\\.[0-9]{2}.*|[0-9]\\.XX.*|0.*|..00.*|.{4}.00.*$)([X1-8])\\.(?!00$)([X0-9]{2})\\.(?!00$)(\\d{2})$";

	public static ProgramClassification classify(String code) {
		if (!code.matches(REGEX)) throw new RuntimeException("Invalid code");
		var groups = RegexUtil.groups(code, REGEX);
		return new ProgramClassification(String.join(".", groups.subList(0, 1)),
		                                 String.join(".", groups.subList(0, 2)),
		                                 String.join(".", groups.subList(0, 3)));
	}

}