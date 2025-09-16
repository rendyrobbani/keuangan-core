package com.rendyrobbani.keuangan.core.common.util.number;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
final class NumberUtilOfFormat {

	private static DecimalFormatSymbols symbol;

	private static DecimalFormatSymbols symbol() {
		if (symbol == null) {
			symbol = new DecimalFormatSymbols();
			symbol.setGroupingSeparator('.');
			symbol.setDecimalSeparator(',');
		}
		return symbol;
	}

	private static DecimalFormat format;

	private static DecimalFormat format() {
		if (format == null) {
			format = new DecimalFormat("#,###.00", symbol());
			format.setMinimumFractionDigits(2);
			format.setMaximumFractionDigits(2);
		}
		return format;
	}

	public static String format(BigDecimal number) {
		if (number != null) return format().format(number);
		return null;
	}

	public static String format(Long number) {
		if (number != null) return format().format(number.longValue());
		return null;
	}

	public static String format(Double number) {
		if (number != null) return format().format(number.doubleValue());
		return null;
	}

}