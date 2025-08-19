package com.rendyrobbani.keuangan.core.common.util.name;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class NameUtil {

	public static String nameOnly(String name, boolean toUpperCase) {
		if (name == null || name.isBlank()) return name;
		if (toUpperCase) {
			name = name.toUpperCase();
			if (name.startsWith("HJ. ")) return "Hj. " + name.substring(4);
			return name.toUpperCase();
		}
		return name;
	}

	public static String nameFull(String name, boolean toUpperCase, String titlePrefix, String titleSuffix) {
		if (name == null || name.isBlank()) return name;
		var nameFull = nameOnly(name, toUpperCase);
		if (titlePrefix != null && !titlePrefix.isEmpty()) nameFull = titlePrefix + " " + nameFull;
		if (titleSuffix != null && !titleSuffix.isEmpty()) nameFull = nameFull + ", " + titleSuffix;
		return nameFull;
	}

}