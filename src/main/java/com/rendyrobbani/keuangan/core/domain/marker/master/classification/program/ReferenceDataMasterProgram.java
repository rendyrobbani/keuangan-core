package com.rendyrobbani.keuangan.core.domain.marker.master.classification.program;

import com.rendyrobbani.keuangan.core.domain.entity.master.classification.program.DataMasterProgram;

public interface ReferenceDataMasterProgram {

	DataMasterProgram program();

	String programId();

	default String programCode() {
		if (this.program() == null) return null;
		return this.program().code();
	}

	default String programCode(String bidangCode) {
		if (this.program() == null) return null;
		return this.program().code().replace("X.XX", bidangCode != null ? bidangCode : "X.XX");
	}

	default String programName() {
		if (this.program() == null) return null;
		return this.program().name();
	}

	default String programName(boolean toUpperCase) {
		if (this.program() == null) return null;
		return this.program().name(toUpperCase);
	}

}