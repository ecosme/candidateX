package com.tradingstockmx.dao;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class BlackList {
	
	@Column
	private int personalId;
	@Column
	private java.sql.Date upto;
	
	public int getPersonalId() {
		return personalId;
	}
	public void setPersonalId(int personalId) {
		this.personalId = personalId;
	}
	public java.sql.Date getUpto() {
		return upto;
	}
	public void setUpto(java.sql.Date upto) {
		this.upto = upto;
	}

}
