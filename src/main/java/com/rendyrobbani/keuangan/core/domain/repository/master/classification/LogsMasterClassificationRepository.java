package com.rendyrobbani.keuangan.core.domain.repository.master.classification;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.LogsMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.repository.master.LogsMasterRepository;

public interface LogsMasterClassificationRepository<ENTITY extends LogsMasterClassificationEntity<SUBJECT>, SUBJECT extends DataMasterClassificationEntity> extends LogsMasterRepository<ENTITY, SUBJECT, String> {

}