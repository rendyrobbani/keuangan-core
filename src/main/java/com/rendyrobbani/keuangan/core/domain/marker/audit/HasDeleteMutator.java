package com.rendyrobbani.keuangan.core.domain.marker.audit;

import java.time.LocalDateTime;

public interface HasDeleteMutator {

	void delete(LocalDateTime deletedAt, String deletedBy);

	void revive(LocalDateTime revivedAt, String revivedBy);

}