package com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal;

import com.rendyrobbani.keuangan.core.domain.entity.budget.DataBudgetEntity;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLock;
import com.rendyrobbani.keuangan.core.domain.marker.audit.HasLockMutator;
import com.rendyrobbani.keuangan.core.domain.marker.budget.HasBudgetTahapan;
import com.rendyrobbani.keuangan.core.domain.vo.BudgetTahapan;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface DataBudgetJadwal extends DataBudgetEntity<Long>,
                                          HasBudgetTahapan,
                                          HasLock,
                                          HasLockMutator {

	@Override
	Long id();

	Short year();

	@Override
	Long tahapanId();

	Long rkpdId();

	DataBudgetJadwal rkpd();

	Long ppasId();

	DataBudgetJadwal ppas();

	Long apbdId();

	DataBudgetJadwal apbd();

	Long sipdId();

	String name();

	LocalDateTime from();

	LocalDateTime into();

	boolean isPerda();

	LocalDate perdaDate();

	String perdaNumber();

	boolean isPerkada();

	LocalDate perkadaDate();

	String perkadaNumber();

	@Override
	boolean isLocked();

	@Override
	LocalDateTime lockedAt();

	@Override
	String lockedBy();

	@Override
	LocalDateTime createdAt();

	@Override
	String createdBy();

	@Override
	LocalDateTime updatedAt();

	@Override
	String updatedBy();

	@Override
	boolean isDeleted();

	@Override
	LocalDateTime deletedAt();

	@Override
	String deletedBy();

	void create(BudgetTahapan tahapan, DataBudgetJadwal rkpd, DataBudgetJadwal ppas, DataBudgetJadwal apbd, Long sipdId, String name, LocalDateTime from, LocalDateTime into, boolean isPerda, LocalDate perdaDate, String perdaNumber, boolean isPerkada, LocalDate perkadaDate, String perkadaNumber, LocalDateTime createdAt, String createdBy);

	void update(BudgetTahapan tahapan, DataBudgetJadwal rkpd, DataBudgetJadwal ppas, DataBudgetJadwal apbd, Long sipdId, String name, LocalDateTime from, LocalDateTime into, boolean isPerda, LocalDate perdaDate, String perdaNumber, boolean isPerkada, LocalDate perkadaDate, String perkadaNumber, LocalDateTime updatedAt, String updatedBy);

}