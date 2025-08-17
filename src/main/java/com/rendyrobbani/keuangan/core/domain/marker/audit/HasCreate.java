package com.rendyrobbani.keuangan.core.domain.marker.audit;

import java.time.LocalDateTime;

public interface HasCreate {

	LocalDateTime createdAt();

	String createdBy();

}