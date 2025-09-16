package com.rendyrobbani.keuangan.core.common.util.koefisien;

import com.rendyrobbani.keuangan.core.common.util.number.NumberUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class KoefisienUtil {

	public static String from(BigDecimal volume, String satuan) {
		if (volume != null) {
			String v = NumberUtil.format(volume);
			if (satuan == null || satuan.isBlank()) return v;
			return v + " " + satuan;
		}
		return null;
	}

}