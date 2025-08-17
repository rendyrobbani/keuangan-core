package com.rendyrobbani.keuangan.core.domain.marker.audit;

import java.time.LocalDateTime;

public interface HasUpdate {

	LocalDateTime updatedAt();

	String updatedBy();

}