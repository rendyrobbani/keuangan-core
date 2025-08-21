package com.rendyrobbani.keuangan.core.domain.repository.master.classification.kelompok;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.kelompok.DataMasterKelompok;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.DataMasterClassificationRepository;
import com.rendyrobbani.keuangan.core.domain.vo.KomponenType;

import java.util.List;

public interface DataMasterKelompokRepository extends DataMasterClassificationRepository<DataMasterKelompok> {

	List<DataMasterKelompok> findByType(KomponenType type);

	List<DataMasterKelompok> findByTypeAndLevel(KomponenType type, Integer level);

}