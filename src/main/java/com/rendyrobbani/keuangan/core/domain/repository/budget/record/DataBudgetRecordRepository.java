package com.rendyrobbani.keuangan.core.domain.repository.budget.record;

import com.rendyrobbani.keuangan.core.domain.entity.DataEntity;
import com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal.DataBudgetJadwal;
import com.rendyrobbani.keuangan.core.domain.entity.budget.record.DataBudgetRecordEntity;
import com.rendyrobbani.keuangan.core.domain.repository.budget.DataBudgetRepository;

import java.sql.Connection;
import java.util.List;

public interface DataBudgetRecordRepository<ENTITY extends DataBudgetRecordEntity<COMMON, COMMONID>, COMMON extends DataEntity<COMMONID>, COMMONID> extends DataBudgetRepository<ENTITY, String> {

	List<ENTITY> findByJadwalId(Long jadwalId);

	List<ENTITY> findByJadwalIdAndIsDeletedFalse(Long jadwalId);

	List<ENTITY> findByJadwalIdAndIsDeletedTrue(Long jadwalId);

	List<ENTITY> findByJadwal(DataBudgetJadwal jadwal);

	List<ENTITY> findByJadwalAndIsDeletedFalse(DataBudgetJadwal jadwal);

	List<ENTITY> findByJadwalAndIsDeletedTrue(DataBudgetJadwal jadwal);

	void saveByJadwal(Connection connection, DataBudgetJadwal jadwal);

	void deleteByJadwal(Connection connection, DataBudgetJadwal jadwal);

}