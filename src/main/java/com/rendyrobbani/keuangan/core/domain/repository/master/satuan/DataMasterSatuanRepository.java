package com.rendyrobbani.keuangan.core.domain.repository.master.satuan;

import com.rendyrobbani.keuangan.core.domain.entity.master.satuan.DataMasterSatuan;
import com.rendyrobbani.keuangan.core.domain.repository.master.DataMasterRepository;

import java.util.List;

public interface DataMasterSatuanRepository extends DataMasterRepository<DataMasterSatuan, Long> {

	List<DataMasterSatuan> findByName();

	List<DataMasterSatuan> findByNameAndIsDeletedFalse();

	List<DataMasterSatuan> findByNameAndIsDeletedTrue();

}