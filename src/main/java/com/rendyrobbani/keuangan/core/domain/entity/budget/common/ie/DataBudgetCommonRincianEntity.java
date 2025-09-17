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

	BigDecimal volume();

	String satuan();

	BigDecimal price();

}