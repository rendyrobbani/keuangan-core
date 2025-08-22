package com.rendyrobbani.keuangan.core.domain.repository.master.penerima;

import com.rendyrobbani.keuangan.core.domain.entity.master.penerima.DataMasterPenerima;
import com.rendyrobbani.keuangan.core.domain.repository.master.DataMasterRepository;
import com.rendyrobbani.keuangan.core.domain.vo.PenerimaJenis;

import java.util.List;

public interface DataMasterPenerimaRepository extends DataMasterRepository<DataMasterPenerima, Long> {

	List<DataMasterPenerima> findByName(String name);

	List<DataMasterPenerima> findByNameAndIsDeletedFalse(String name);

	List<DataMasterPenerima> findByNameAndIsDeletedTrue(String name);

	List<DataMasterPenerima> findByJenis(PenerimaJenis jenis);

	List<DataMasterPenerima> findByJenisAndIsDeletedFalse(PenerimaJenis jenis);

	List<DataMasterPenerima> findByJenisAndIsDeletedTrue(PenerimaJenis jenis);

}