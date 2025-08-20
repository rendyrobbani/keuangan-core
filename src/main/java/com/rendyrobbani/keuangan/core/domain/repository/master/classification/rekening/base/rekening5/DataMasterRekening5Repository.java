package com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.base.rekening5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening5.DataMasterRekening5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.DataMasterClassificationRepository;

import java.util.List;

public interface DataMasterRekening5Repository<ENTITY extends DataMasterRekening5> extends DataMasterClassificationRepository<ENTITY> {

	List<ENTITY> findByRekening1Id(String rekening1Id);

	List<ENTITY> findByRekening1IdAndIsDeletedFalse(String rekening1Id);

	List<ENTITY> findByRekening1IdAndIsDeletedTrue(String rekening1Id);

	List<ENTITY> findByRekening2Id(String rekening2Id);

	List<ENTITY> findByRekening2IdAndIsDeletedFalse(String rekening2Id);

	List<ENTITY> findByRekening2IdAndIsDeletedTrue(String rekening2Id);

	List<ENTITY> findByRekening3Id(String rekening3Id);

	List<ENTITY> findByRekening3IdAndIsDeletedFalse(String rekening3Id);

	List<ENTITY> findByRekening3IdAndIsDeletedTrue(String rekening3Id);

	List<ENTITY> findByRekening4Id(String rekening4Id);

	List<ENTITY> findByRekening4IdAndIsDeletedFalse(String rekening4Id);

	List<ENTITY> findByRekening4IdAndIsDeletedTrue(String rekening4Id);

}