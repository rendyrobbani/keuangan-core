package com.rendyrobbani.keuangan.core.domain.repository.master.classification;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.repository.master.DataMasterRepository;

public interface DataMasterClassificationRepository<ENTITY extends DataMasterClassificationEntity> extends DataMasterRepository<ENTITY, String> {

}