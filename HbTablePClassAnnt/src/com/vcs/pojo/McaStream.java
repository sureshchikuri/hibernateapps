package com.vcs.pojo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MCASTREAM")
public class McaStream extends Student1 {

	private String mcaStream;

	@Column(name = "MCASTREAM", length = 25)
	public String getMcaStream() {
		return this.mcaStream;
	}

	public void setMcaStream(String mcaStream) {
		this.mcaStream = mcaStream;
	}
}
