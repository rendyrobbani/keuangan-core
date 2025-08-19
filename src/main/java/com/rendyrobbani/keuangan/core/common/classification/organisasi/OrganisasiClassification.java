package com.rendyrobbani.keuangan.core.common.classification.organisasi;

import com.rendyrobbani.keuangan.core.common.util.regex.RegexUtil;
import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@SuppressWarnings("ClassCanBeRecord")
public final class OrganisasiClassification {

	private final String skpdCode;

	private final String unitCode;

	private final boolean isSkpd;

	private final boolean isUnit;

	private final String bidang1Code;

	private final String bidang2Code;

	private final String bidang3Code;

	private final String skpdIndex;

	private final String unitIndex;

	public static final String REGEX = "^(\\d\\.\\d{2})\\.(\\d\\.\\d{2})\\.(\\d\\.\\d{2})\\.(\\d{2})\\.(\\d{4})$";

	public static OrganisasiClassification classify(String code) {
		if (!code.matches(REGEX)) throw new RuntimeException("Invalid code");
		var groups = RegexUtil.groups(code, REGEX);
		return new OrganisasiClassification(code.substring(0, 18) + "0000",
		                                    code,
		                                    code.endsWith("0000"),
		                                    !code.endsWith("0000"),
		                                    groups.get(0).equals("0.00") ? null : groups.get(0),
		                                    groups.get(1).equals("0.00") ? null : groups.get(1),
		                                    groups.get(2).equals("0.00") ? null : groups.get(2),
		                                    groups.get(3),
		                                    groups.get(4));
	}

}