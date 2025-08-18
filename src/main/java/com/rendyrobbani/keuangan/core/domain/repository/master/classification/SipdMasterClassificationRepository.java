package com.rendyrobbani.keuangan.core.domain.repository.master.classification;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.DataMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.entity.master.classification.SipdMasterClassificationEntity;
import com.rendyrobbani.keuangan.core.domain.repository.Repository;

public interface SipdMasterClassificationRepository<ENTITY extends SipdMasterClassificationEntity<SUBJECT>, SUBJECT extends DataMasterClassificationEntity> extends Repository<ENTITY, Long> {

}