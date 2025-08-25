package com.rendyrobbani.keuangan.core.common.classification.kelompok;

import com.rendyrobbani.keuangan.core.common.util.regex.RegexUtil;
import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@SuppressWarnings({"ClassCanBeRecord", "SizeReplaceableByIsEmpty"})
public final class KelompokClassification {

	private final Byte level;

	private final String kelompok1Code;

	private final String kelompok2Code;

	private final String kelompok3Code;

	private final String kelompok4Code;

	private final String kelompok5Code;

	private final String kelompok6Code;

	public static final String LEVEL1_REGEX = "^(?![02-79].*|..0.*|.{3}.0{2}.*|.{6}.0{2}.*|.{9}.0{2}.*|.{12}.0{2}.*|.{17}.0{4}.*$)([18])$";

	public static final String LEVEL2_REGEX = "^(?![02-79].*|..0.*|.{3}.0{2}.*|.{6}.0{2}.*|.{9}.0{2}.*|.{12}.0{2}.*|.{17}.0{4}.*$)([18])\\.(?!0$)(\\d)$";

	public static final String LEVEL3_REGEX = "^(?![02-79].*|..0.*|.{3}.0{2}.*|.{6}.0{2}.*|.{9}.0{2}.*|.{12}.0{2}.*|.{17}.0{4}.*$)([18])\\.(?!0$)(\\d)\\.(?!0{2}$)(\\d{2})$";

	public static final String LEVEL4_REGEX = "^(?![02-79].*|..0.*|.{3}.0{2}.*|.{6}.0{2}.*|.{9}.0{2}.*|.{12}.0{2}.*|.{17}.0{4}.*$)([18])\\.(?!0$)(\\d)\\.(?!0{2}$)(\\d{2})\\.(?!0{2}$)(\\d{2})$";

	public static final String LEVEL5_REGEX = "^(?![02-79].*|..0.*|.{3}.0{2}.*|.{6}.0{2}.*|.{9}.0{2}.*|.{12}.0{2}.*|.{17}.0{4}.*$)([18])\\.(?!0$)(\\d)\\.(?!0{2}$)(\\d{2})\\.(?!0{2}$)(\\d{2})\\.(?!0{2}$)(\\d{2})$";

	public static final String LEVEL6_REGEX = "^(?![02-79].*|..0.*|.{3}.0{2}.*|.{6}.0{2}.*|.{9}.0{2}.*|.{12}.0{2}.*|.{17}.0{4}.*$)([18])\\.(?!0$)(\\d)\\.(?!0{2}$)(\\d{2})\\.(?!0{2}$)(\\d{2})\\.(?!0{2}$)(\\d{2})\\.(?!0{4}$)(\\d{4})$";

	public static KelompokClassification classify(String code) {
		for (int level = 1; level <= 6; level++) {
			String regex = switch (level) {
				case 1 -> LEVEL1_REGEX;
				case 2 -> LEVEL2_REGEX;
				case 3 -> LEVEL3_REGEX;
				case 4 -> LEVEL4_REGEX;
				case 5 -> LEVEL5_REGEX;
				case 6 -> LEVEL6_REGEX;
				default -> null;
			};
			if (code.matches(regex)) {
				var groups = RegexUtil.groups(code, regex);
				return new KelompokClassification((byte) level,
				                                  groups.size() >= 1 ? String.join(".", groups.subList(0, 1)) : null,
				                                  groups.size() >= 2 ? String.join(".", groups.subList(0, 2)) : null,
				                                  groups.size() >= 3 ? String.join(".", groups.subList(0, 3)) : null,
				                                  groups.size() >= 4 ? String.join(".", groups.subList(0, 4)) : null,
				                                  groups.size() >= 5 ? String.join(".", groups.subList(0, 5)) : null,
				                                  groups.size() >= 6 ? String.join(".", groups.subList(0, 6)) : null);
			}
		}
		throw new RuntimeException("Invalid code");
	}

}