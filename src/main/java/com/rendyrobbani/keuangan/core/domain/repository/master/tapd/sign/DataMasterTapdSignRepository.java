package com.rendyrobbani.keuangan.core.domain.repository.master.tapd.sign;

import com.rendyrobbani.keuangan.core.domain.entity.master.tapd.sign.DataMasterTapdSign;
import com.rendyrobbani.keuangan.core.domain.repository.master.DataMasterRepository;

import java.util.List;

public interface DataMasterTapdSignRepository extends DataMasterRepository<DataMasterTapdSign, String> {

	List<DataMasterTapdSign> findByIsDeletedFalseAndIsLockedFalse();

}