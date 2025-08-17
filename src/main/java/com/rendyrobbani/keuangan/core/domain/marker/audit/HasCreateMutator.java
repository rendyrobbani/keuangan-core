package com.rendyrobbani.keuangan.core.domain.marker.audit;

import java.time.LocalDateTime;

public interface HasCreateMutator {

	void create(LocalDateTime createdAt, String createdBy);

}