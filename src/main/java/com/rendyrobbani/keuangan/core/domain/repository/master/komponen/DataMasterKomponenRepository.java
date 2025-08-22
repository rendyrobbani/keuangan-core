package com.rendyrobbani.keuangan.core.domain.repository.master.komponen;

import com.rendyrobbani.keuangan.core.domain.entity.master.komponen.DataMasterKomponen;
import com.rendyrobbani.keuangan.core.domain.repository.master.DataMasterRepository;

import java.util.List;

public interface DataMasterKomponenRepository extends DataMasterRepository<DataMasterKomponen, Long> {

	List<DataMasterKomponen> findByType(String type);

	List<DataMasterKomponen> findByTypeAndIsDeletedFalse(String type);

	List<DataMasterKomponen> findByTypeAndIsDeletedTrue(String type);

	List<DataMasterKomponen> findByTypeAndRekeningId(String type, String rekeningId);

	List<DataMasterKomponen> findByTypeAndRekeningIdAndIsDeletedFalse(String type, String rekeningId);

	List<DataMasterKomponen> findByTypeAndRekeningIdAndIsDeletedTrue(String type, String rekeningId);

	List<DataMasterKomponen> findByRekeningId(String rekeningId);

	List<DataMasterKomponen> findByRekeningIdAndIsDeletedFalse(String rekeningId);

	List<DataMasterKomponen> findByRekeningIdAndIsDeletedTrue(String rekeningId);

}