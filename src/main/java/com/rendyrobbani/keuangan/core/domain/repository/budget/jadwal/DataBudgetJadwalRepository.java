package com.rendyrobbani.keuangan.core.domain.repository.budget.jadwal;

import com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal.DataBudgetJadwal;
import com.rendyrobbani.keuangan.core.domain.repository.budget.DataBudgetRepository;
import com.rendyrobbani.keuangan.core.domain.vo.BudgetTahapan;

import java.util.List;

public interface DataBudgetJadwalRepository extends DataBudgetRepository<DataBudgetJadwal, Long> {

	List<DataBudgetJadwal> findByTahapan(BudgetTahapan tahapan);

	DataBudgetJadwal findLatest();

	DataBudgetJadwal findRKPDMurni();

	DataBudgetJadwal findPPASMurni();

	DataBudgetJadwal findAPBDMurni();

	DataBudgetJadwal findRKPDPerubahan();

	DataBudgetJadwal findPPASPerubahan();

	DataBudgetJadwal findAPBDPerubahan();

}