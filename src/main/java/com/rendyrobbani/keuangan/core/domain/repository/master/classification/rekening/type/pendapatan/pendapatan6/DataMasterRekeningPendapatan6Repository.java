package com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan6.DataMasterRekeningPendapatan6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.base.rekening6.DataMasterRekening6Repository;

import java.util.List;

public interface DataMasterRekeningPendapatan6Repository extends DataMasterRekening6Repository<DataMasterRekeningPendapatan6> {

	List<DataMasterRekeningPendapatan6> findByIsEnabledFalse();

	List<DataMasterRekeningPendapatan6> findByIsEnabledTrue();

}