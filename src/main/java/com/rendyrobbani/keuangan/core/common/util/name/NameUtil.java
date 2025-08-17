package com.rendyrobbani.keuangan.core.common.util.name;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class NameUtil {

	public static String onlyName(String name, boolean toUpperCase) {
		if (name == null || name.isBlank()) return name;
		if (toUpperCase) {
			name = name.toUpperCase();
			if (name.startsWith("HJ. ")) return "Hj. " + name.substring(4);
			return name.toUpperCase();
		}
		return name;
	}

	public static String fullName(String name, boolean toUpperCase, String titlePrefix, String titleSuffix) {
		if (name == null || name.isBlank()) return name;
		var fullName = onlyName(name, toUpperCase);
		if (titlePrefix != null && !titlePrefix.isEmpty()) fullName = titlePrefix + " " + fullName;
		if (titleSuffix != null && !titleSuffix.isEmpty()) fullName = fullName + ", " + titleSuffix;
		return fullName;
	}

}