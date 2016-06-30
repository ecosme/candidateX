package com.tradingstockmx.entity;

import java.sql.Date;

public class LoanBean {

	private int id;
	private float loanAmount;
	private Date term;
	private String name;
	private String surname;
	private String personalId;
	private char approved;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Date getTerm() {
		return term;
	}
	public void setTerm(Date term) {
		this.term = term;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPersonalId() {
		return personalId;
	}
	public void setPersonalId(String personalId) {
		this.personalId = personalId;
	}
	public char getApproved() {
		return approved;
	}
	public void setApproved(char approved) {
		this.approved = approved;
	}
	
	
}
