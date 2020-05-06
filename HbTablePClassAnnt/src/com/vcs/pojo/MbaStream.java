package com.vcs.pojo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("MBASTREAM")
public class MbaStream extends Student1 {

	private String mbaStream;
	
	@Column(name = "MBASTREAM", length = 25)
	public String getMbaStream() {
		return this.mbaStream;
	}

	public void setMbaStream(String mbaStream) {
		this.mbaStream = mbaStream;
	}
}
