package com.rendyrobbani.keuangan.core.domain.marker.audit;

import java.time.LocalDateTime;

public interface HasDelete {

	boolean isDeleted();

	LocalDateTime deletedAt();

	String deletedBy();

}