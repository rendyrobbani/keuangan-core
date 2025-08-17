package com.rendyrobbani.keuangan.core.domain.marker.audit;

import java.time.LocalDateTime;

public interface HasLock {

	boolean isLocked();

	LocalDateTime lockedAt();

	String lockedBy();

}