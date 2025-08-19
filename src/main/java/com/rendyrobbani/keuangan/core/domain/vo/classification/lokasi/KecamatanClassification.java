package com.rendyrobbani.keuangan.core.domain.vo.classification.lokasi;

import com.rendyrobbani.keuangan.core.common.util.regex.RegexUtil;
import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@SuppressWarnings("ClassCanBeRecord")
public final class KecamatanClassification {

	private final String provinsiCode;

	private final String kabupatenCode;

	private final String kecamatanCode;

	public static final String REGEX = "^(?!00.*|.{2}.00.*|.{5}.00.*$)(\\d{2})\\.(?!00$)(\\d{2})\\.(?!00$)(\\d{2})$";

	public static KecamatanClassification parse(String code) {
		if (!code.matches(REGEX)) throw new RuntimeException("Invalid code");
		var groups = RegexUtil.groups(code, REGEX);
		return new KecamatanClassification(String.join(".", groups.subList(0, 1)),
		                                   String.join(".", groups.subList(0, 2)),
		                                   String.join(".", groups.subList(0, 3)));
	}

}