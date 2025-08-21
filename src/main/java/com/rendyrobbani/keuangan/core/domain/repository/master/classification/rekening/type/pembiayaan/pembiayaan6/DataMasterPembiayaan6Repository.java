package com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pembiayaan.pembiayaan6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan6.DataMasterPembiayaan6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.base.rekening6.DataMasterRekening6Repository;

import java.util.List;

public interface DataMasterPembiayaan6Repository extends DataMasterRekening6Repository<DataMasterPembiayaan6> {

	List<DataMasterPembiayaan6> findByIsEnabledFalse();

	List<DataMasterPembiayaan6> findByIsEnabledTrue();

	List<DataMasterPembiayaan6> findByIsIncomeTrue();

	List<DataMasterPembiayaan6> findByIsIncomeTrueIsEnabledFalse();

	List<DataMasterPembiayaan6> findByIsIncomeTrueIsEnabledTrue();

	List<DataMasterPembiayaan6> findByIsExpendTrue();

	List<DataMasterPembiayaan6> findByIsExpendTrueIsEnabledFalse();

	List<DataMasterPembiayaan6> findByIsExpendTrueIsEnabledTrue();

}