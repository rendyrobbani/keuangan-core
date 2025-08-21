package com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja6.DataMasterBelanja6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.base.rekening6.DataMasterRekening6Repository;
import com.rendyrobbani.keuangan.core.domain.vo.BelanjaJenis;
import com.rendyrobbani.keuangan.core.domain.vo.BelanjaLokus;

import java.util.List;

public interface DataMasterBelanja6Repository extends DataMasterRekening6Repository<DataMasterBelanja6> {

	List<DataMasterBelanja6> findByIsEnabledFalse();

	List<DataMasterBelanja6> findByIsEnabledTrue();

	List<DataMasterBelanja6> findByJenis(BelanjaJenis jenis);

	List<DataMasterBelanja6> findByJenisIsEnabledFalse(BelanjaJenis jenis);

	List<DataMasterBelanja6> findByJenisIsEnabledTrue(BelanjaJenis jenis);

	List<DataMasterBelanja6> findByLokus(BelanjaLokus lokus);

	List<DataMasterBelanja6> findByLokusIsEnabledFalse(BelanjaLokus lokus);

	List<DataMasterBelanja6> findByLokusIsEnabledTrue(BelanjaLokus lokus);

}