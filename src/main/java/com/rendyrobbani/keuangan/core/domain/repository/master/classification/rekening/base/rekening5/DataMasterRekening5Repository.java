package com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.base.rekening5;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening5.DataMasterRekening5;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.DataMasterClassificationRepository;

import java.util.List;

public interface DataMasterRekening5Repository<ENTITY extends DataMasterRekening5> extends DataMasterClassificationRepository<ENTITY> {

	List<ENTITY> findByRekening1Id(String rekening1Id);

	List<ENTITY> findByRekening1IdAndIsDeletedFalse(String rekening1Id);

	List<ENTITY> findByRekening1IdAndIsDeletedTrue(String rekening1Id);

	List<ENTITY> findByrekening2Id(String rekening2Id);

	List<ENTITY> findByrekening2IdAndIsDeletedFalse(String rekening2Id);

	List<ENTITY> findByrekening2IdAndIsDeletedTrue(String rekening2Id);

	List<ENTITY> findByrekening3Id(String rekening3Id);

	List<ENTITY> findByrekening3IdAndIsDeletedFalse(String rekening3Id);

	List<ENTITY> findByrekening3IdAndIsDeletedTrue(String rekening3Id);

	List<ENTITY> findByrekening4Id(String rekening4Id);

	List<ENTITY> findByrekening4IdAndIsDeletedFalse(String rekening4Id);

	List<ENTITY> findByrekening4IdAndIsDeletedTrue(String rekening4Id);

}