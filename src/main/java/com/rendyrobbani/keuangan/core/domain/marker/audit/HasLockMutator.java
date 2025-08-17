package com.rendyrobbani.keuangan.core.domain.marker.audit;

import java.time.LocalDateTime;

public interface HasLockMutator {

	void lock(LocalDateTime lockedAt, String lockedBy);

	void unlock(LocalDateTime unlockedAt, String unlockedBy);

}