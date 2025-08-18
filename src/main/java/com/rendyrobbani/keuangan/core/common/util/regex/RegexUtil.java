package com.rendyrobbani.keuangan.core.common.util.regex;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class RegexUtil {

	public static List<String> groups(String value, String regex) {
		var groups = new ArrayList<String>();
		var matcher = Pattern.compile(regex).matcher(value);
		if (!matcher.matches()) throw new RuntimeException("Value does not match regex");
		for (int i = 1; i <= matcher.groupCount(); i++) groups.add(matcher.group(i));
		return groups;
	}

}