package com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.type.belanja.belanja6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.type.belanja.belanja6.DataMasterRekeningBelanja6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.base.rekening6.DataMasterRekening6Repository;
import com.rendyrobbani.keuangan.core.domain.vo.BelanjaJenis;
import com.rendyrobbani.keuangan.core.domain.vo.BelanjaLokus;

import java.util.List;

public interface DataMasterRekeningBelanja6Repository extends DataMasterRekening6Repository<DataMasterRekeningBelanja6> {

	List<DataMasterRekeningBelanja6> findByIsEnabledFalse();

	List<DataMasterRekeningBelanja6> findByIsEnabledTrue();

	List<DataMasterRekeningBelanja6> findByJenis(BelanjaJenis jenis);

	List<DataMasterRekeningBelanja6> findByJenisIsEnabledFalse(BelanjaJenis jenis);

	List<DataMasterRekeningBelanja6> findByJenisIsEnabledTrue(BelanjaJenis jenis);

	List<DataMasterRekeningBelanja6> findByLokus(BelanjaLokus lokus);

	List<DataMasterRekeningBelanja6> findByLokusIsEnabledFalse(BelanjaLokus lokus);

	List<DataMasterRekeningBelanja6> findByLokusIsEnabledTrue(BelanjaLokus lokus);

}