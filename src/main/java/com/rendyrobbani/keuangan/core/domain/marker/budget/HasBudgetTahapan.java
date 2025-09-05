package com.rendyrobbani.keuangan.core.domain.marker.budget;

import com.rendyrobbani.keuangan.core.domain.vo.BudgetTahapan;

public interface HasBudgetTahapan {

	default Long tahapanId() {
		if (this.tahapan() == null) return null;
		return this.tahapan().id();
	}

	BudgetTahapan tahapan();

}