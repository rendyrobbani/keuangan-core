package com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.pembiayaan.pembiayaan6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.pembiayaan.pembiayaan6.DataMasterRekeningPembiayaan6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.base.rekening6.DataMasterRekening6Repository;

import java.util.List;

public interface DataMasterRekeningPembiayaan6Repository extends DataMasterRekening6Repository<DataMasterRekeningPembiayaan6> {

	List<DataMasterRekeningPembiayaan6> findByIsEnabledFalse();

	List<DataMasterRekeningPembiayaan6> findByIsEnabledTrue();

	List<DataMasterRekeningPembiayaan6> findByIsIncomeTrue();

	List<DataMasterRekeningPembiayaan6> findByIsIncomeTrueIsEnabledFalse();

	List<DataMasterRekeningPembiayaan6> findByIsIncomeTrueIsEnabledTrue();

	List<DataMasterRekeningPembiayaan6> findByIsExpendTrue();

	List<DataMasterRekeningPembiayaan6> findByIsExpendTrueIsEnabledFalse();

	List<DataMasterRekeningPembiayaan6> findByIsExpendTrueIsEnabledTrue();

}