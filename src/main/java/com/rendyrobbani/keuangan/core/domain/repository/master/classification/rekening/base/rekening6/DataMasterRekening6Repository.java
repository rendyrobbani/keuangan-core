package com.rendyrobbani.keuangan.core.domain.repository.master.classification.rekening.base.rekening6;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.rekening.base.rekening6.DataMasterRekening6;
import com.rendyrobbani.keuangan.core.domain.repository.master.classification.DataMasterClassificationRepository;

import java.util.List;

public interface DataMasterRekening6Repository<ENTITY extends DataMasterRekening6> extends DataMasterClassificationRepository<ENTITY> {

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

	List<ENTITY> findByrekening5Id(String rekening5Id);

	List<ENTITY> findByrekening5IdAndIsDeletedFalse(String rekening5Id);

	List<ENTITY> findByrekening5IdAndIsDeletedTrue(String rekening5Id);

}