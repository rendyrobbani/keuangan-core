package com.rendyrobbani.keuangan.core.common.classification.lokasi;

import com.rendyrobbani.keuangan.core.common.util.regex.RegexUtil;
import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@SuppressWarnings("ClassCanBeRecord")
public final class KelurahanClassification {

	private final String provinsiCode;

	private final String kabupatenCode;

	private final String kecamatanCode;

	private final String kelurahanCode;

	public static final String REGEX = "^(?!00.*|.{2}.00.*|.{5}.00.*|.{8}.00.*$)(\\d{2})\\.(?!00$)(\\d{2})\\.(?!00$)(\\d{2})\\.(?!0{4}$)(\\d{4})$";

	public static KelurahanClassification classify(String code) {
		if (!code.matches(REGEX)) throw new RuntimeException("Invalid code");
		var groups = RegexUtil.groups(code, REGEX);
		return new KelurahanClassification(String.join(".", groups.subList(0, 1)),
		                                   String.join(".", groups.subList(0, 2)),
		                                   String.join(".", groups.subList(0, 3)),
		                                   String.join(".", groups.subList(0, 4)));
	}

}