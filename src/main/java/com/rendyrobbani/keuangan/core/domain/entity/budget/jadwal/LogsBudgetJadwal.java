package com.rendyrobbani.keuangan.core.domain.entity.budget.jadwal;

import com.rendyrobbani.keuangan.core.domain.entity.budget.LogsBudgetEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface LogsBudgetJadwal extends LogsBudgetEntity<DataBudgetJadwal, Long> {

	@Override
	Long id();

	Short year();

	Byte tahapanId();

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

	boolean isLocked();

	boolean isDeleted();

	@Override
	LocalDateTime loggedAt();

	@Override
	String loggedBy();

	@Override
	DataBudgetJadwal subject();

	@Override
	Long subjectId();

	@Override
	void create(DataBudgetJadwal subject, LocalDateTime createdAt, String createdBy);

}