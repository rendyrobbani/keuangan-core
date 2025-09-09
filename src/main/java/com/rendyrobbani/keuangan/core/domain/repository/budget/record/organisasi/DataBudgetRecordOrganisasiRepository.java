package com.rendyrobbani.keuangan.core.domain.repository.budget.record.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.budget.record.organisasi.DataBudgetRecordOrganisasi;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.repository.budget.record.DataBudgetRecordRepository;

public interface DataBudgetRecordOrganisasiRepository extends DataBudgetRecordRepository<DataBudgetRecordOrganisasi, DataMasterOrganisasi, String> {

}