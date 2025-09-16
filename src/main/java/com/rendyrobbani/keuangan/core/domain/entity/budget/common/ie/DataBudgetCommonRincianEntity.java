package com.rendyrobbani.keuangan.core.domain.entity.budget.common.ie;

import com.rendyrobbani.keuangan.core.common.util.koefisien.KoefisienUtil;

import java.math.BigDecimal;
import java.util.ArrayList;

public interface DataBudgetCommonRincianEntity extends DataBudgetCommonRekeningEntity {

	String description();

	String information();

	BigDecimal volume1();

	String satuan1();

	default String koefisien1() {
		return KoefisienUtil.from(this.volume1(), this.satuan1());
	}

	BigDecimal volume2();

	String satuan2();

	default String koefisien2() {
		return KoefisienUtil.from(this.volume2(), this.satuan2());
	}

	BigDecimal volume3();

	String satuan3();

	default String koefisien3() {
		return KoefisienUtil.from(this.volume3(), this.satuan3());
	}

	BigDecimal volume4();

	String satuan4();

	default String koefisien4() {
		return KoefisienUtil.from(this.volume4(), this.satuan4());
	}

	default BigDecimal volume() {
		BigDecimal volume = BigDecimal.ZERO;
		if (this.volume1() != null && this.volume1().doubleValue() != 0) {
			volume = this.volume1();
			if (this.volume2() != null && this.volume2().doubleValue() != 0) {
				volume = volume.multiply(this.volume2());
				if (this.volume3() != null && this.volume3().doubleValue() != 0) {
					volume = volume.multiply(this.volume3());
					if (this.volume4() != null && this.volume4().doubleValue() != 0) {
						volume = volume.multiply(this.volume4());
					}
				}
			}
		}
		return volume;
	}

	default String satuan() {
		ArrayList<String> satuan = new ArrayList<>();
		if (this.satuan1() != null && !this.satuan1().isBlank()) {
			satuan.add(this.satuan1());
			if (this.satuan2() != null && !this.satuan2().isBlank()) {
				satuan.add(this.satuan2());
				if (this.satuan3() != null && !this.satuan3().isBlank()) {
					satuan.add(this.satuan3());
					if (this.satuan4() != null && !this.satuan4().isBlank()) {
						satuan.add(this.satuan4());
					}
				}
			}
		}
		return String.join(" ", satuan);
	}

	BigDecimal price();

	default BigDecimal total() {
		BigDecimal v = this.volume();
		BigDecimal p = this.price();
		if (v != null && p != null) return v.multiply(p);
		return BigDecimal.ZERO;
	}

}