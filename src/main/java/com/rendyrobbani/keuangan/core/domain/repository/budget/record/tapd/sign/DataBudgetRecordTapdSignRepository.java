package com.rendyrobbani.keuangan.core.domain.repository.budget.record.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.budget.record.tapd.sign.DataBudgetRecordTapdSign;
import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.DataMasterTapdSign;
import com.rendyrobbani.keuangan.core.domain.repository.budget.record.DataBudgetRecordRepository;

public interface DataBudgetRecordTapdSignRepository extends DataBudgetRecordRepository<DataBudgetRecordTapdSign, DataMasterTapdSign, String> {

}