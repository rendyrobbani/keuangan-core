package com.rendyrobbani.keuangan.core.domain.repository.master.mayor;

import com.rendyrobbani.keuangan.core.domain.entity.master.mayor.DataMasterMayor;
import com.rendyrobbani.keuangan.core.domain.repository.master.DataMasterRepository;

public interface DataMasterMayorRepository extends DataMasterRepository<DataMasterMayor, Byte> {

	DataMasterMayor find();

}