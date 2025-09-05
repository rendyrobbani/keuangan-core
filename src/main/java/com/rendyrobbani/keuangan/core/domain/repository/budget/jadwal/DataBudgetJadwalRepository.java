package com.rendyrobbani.keuangan.core.domain.repository.budget.jadwal;

import com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal.DataBudgetJadwal;
import com.rendyrobbani.keuangan.core.domain.repository.budget.DataBudgetRepository;
import com.rendyrobbani.keuangan.core.domain.vo.BudgetTahapan;

public interface DataBudgetJadwalRepository extends DataBudgetRepository<DataBudgetJadwal, Long> {

	DataBudgetJadwal findByTahapan(BudgetTahapan tahapan);

	DataBudgetJadwal findLatest(BudgetTahapan tahapan);

	DataBudgetJadwal findRKPDMurni();

	DataBudgetJadwal findPPASMurni();

	DataBudgetJadwal findAPBDMurni();

	DataBudgetJadwal findRKPDPerubahan();

	DataBudgetJadwal findPPASPerubahan();

	DataBudgetJadwal findAPBDPerubahan();

}