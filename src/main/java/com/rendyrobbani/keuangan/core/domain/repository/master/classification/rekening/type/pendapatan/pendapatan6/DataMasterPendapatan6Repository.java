package com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pendapatan.pendapatan6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pendapatan.pendapatan6.DataMasterPendapatan6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.base.rekening6.DataMasterRekening6Repository;

import java.util.List;

public interface DataMasterPendapatan6Repository extends DataMasterRekening6Repository<DataMasterPendapatan6> {

	List<DataMasterPendapatan6> findByIsEnabledFalse();

	List<DataMasterPendapatan6> findByIsEnabledTrue();

}