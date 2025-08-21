package com.rendyrobbani.keuangan.core.domain.repository.master.classification.organisasi;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.organisasi.DataMasterOrganisasi;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.DataMasterClassificationRepository;

import java.util.List;

public interface DataMasterOrganisasiRepository extends DataMasterClassificationRepository<DataMasterOrganisasi> {

	List<DataMasterOrganisasi> findByIsSkpd();

	List<DataMasterOrganisasi> findByIsUnit();

	List<DataMasterOrganisasi> findByIsUnitAndSkpdId(String skpdId);

	DataMasterOrganisasi findByIsSetda();

	DataMasterOrganisasi findByIsSkpkd();

}