package com.rendyrobbani.keuangan.core.common.util.koefisien;

import com.rendyrobbani.keuangan.core.common.util.number.NumberUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;

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

	public static BigDecimal volume(BigDecimal volume1, BigDecimal volume2, BigDecimal volume3, BigDecimal volume4) {
		BigDecimal volume = BigDecimal.ZERO;
		if (volume1 != null && volume1.doubleValue() != 0) {
			volume = volume1;
			if (volume2 != null && volume2.doubleValue() != 0) {
				volume = volume.multiply(volume2);
				if (volume3 != null && volume3.doubleValue() != 0) {
					volume = volume.multiply(volume3);
					if (volume4 != null && volume4.doubleValue() != 0) {
						volume = volume.multiply(volume4);
					}
				}
			}
		}
		return volume;
	}

	public static String satuan(String satuan1, String satuan2, String satuan3, String satuan4) {
		ArrayList<String> satuan = new ArrayList<>();
		if (satuan1 != null && !satuan1.isBlank()) {
			satuan.add(satuan1);
			if (satuan2 != null && !satuan2.isBlank()) {
				satuan.add(satuan2);
				if (satuan3 != null && !satuan3.isBlank()) {
					satuan.add(satuan3);
					if (satuan4 != null && !satuan4.isBlank()) {
						satuan.add(satuan4);
					}
				}
			}
		}
		return String.join(" ", satuan);
	}

	public static BigDecimal total(BigDecimal volume, BigDecimal price) {
		if (volume != null && price != null) return volume.multiply(price);
		return BigDecimal.ZERO;
	}

}