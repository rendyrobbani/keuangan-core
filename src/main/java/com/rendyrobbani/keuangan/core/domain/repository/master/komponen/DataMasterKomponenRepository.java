package com.rendyrobbani.keuangan.core.domain.repository.master.komponen;

import com.rendyrobbani.keuangan.core.domain.entity.master.komponen.DataMasterKomponen;
import com.rendyrobbani.keuangan.core.domain.repository.master.DataMasterRepository;
import com.rendyrobbani.keuangan.core.domain.vo.KomponenType;

import java.util.List;

public interface DataMasterKomponenRepository extends DataMasterRepository<DataMasterKomponen, Long> {

	List<DataMasterKomponen> findByType(KomponenType type);

	List<DataMasterKomponen> findByTypeAndIsDeletedFalse(KomponenType type);

	List<DataMasterKomponen> findByTypeAndIsDeletedTrue(KomponenType type);

	List<DataMasterKomponen> findByTypeAndRekeningId(KomponenType type, String rekeningId);

	List<DataMasterKomponen> findByTypeAndRekeningIdAndIsDeletedFalse(KomponenType type, String rekeningId);

	List<DataMasterKomponen> findByTypeAndRekeningIdAndIsDeletedTrue(KomponenType type, String rekeningId);

	List<DataMasterKomponen> findByRekeningId(String rekeningId);

	List<DataMasterKomponen> findByRekeningIdAndIsDeletedFalse(String rekeningId);

	List<DataMasterKomponen> findByRekeningIdAndIsDeletedTrue(String rekeningId);

}