package com.rendyrobbani.keuangan.core.common.classification.kegiatan;

import com.rendyrobbani.keuangan.core.common.util.regex.RegexUtil;
import com.rendyrobbani.keuangan.core.common.classification.fungsi.SubfungsiClassification;
import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@SuppressWarnings("ClassCanBeRecord")
public final class SubkegiatanClassification {

	private final String fungsiCode;

	private final String subfungsiCode;

	private final String urusanCode;

	private final String bidangCode;

	private final String programCode;

	private final String kegiatanCode;

	private final String subkegiatanCode;

	public static final String REGEX = "^(?!X\\.[0-9]{2}.*|[0-9]\\.XX.*|0.*|..00.*|.{4}.00.*|.{7}.0.*|.{7}..00.*$)([X1-8])\\.(?!00$)([X0-9]{2})\\.(?!00$)(\\d{2})\\.((?!0$)\\d\\.(?!00$)\\d{2})\\.(?!0{4}$)(\\d{4})$";

	public static SubkegiatanClassification classify(String code) {
		if (!code.matches(REGEX)) throw new RuntimeException("Invalid code");
		var groups = RegexUtil.groups(code, REGEX);
		SubfungsiClassification subfungsiClassification = SubfungsiClassification.classifyFromKegiatanCode(code);
		return new SubkegiatanClassification(subfungsiClassification.fungsiCode(),
		                                     subfungsiClassification.subfungsiCode(),
		                                     String.join(".", groups.subList(0, 1)),
		                                     String.join(".", groups.subList(0, 2)),
		                                     String.join(".", groups.subList(0, 3)),
		                                     String.join(".", groups.subList(0, 4)),
		                                     String.join(".", groups.subList(0, 5)));
	}

}