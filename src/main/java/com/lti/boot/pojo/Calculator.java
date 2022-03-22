package com.lti.boot.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Calculator01")
public class Calculator 
{
	@Id
	private int schemaId;
	private String schemes;
	private int amount;
	private int duration;
	private int interestRate;
	
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calculator(int schemaId, String schemes, int amount, int duration, int interestRate) {
		super();
		this.schemaId = schemaId;
		this.schemes = schemes;
		this.amount = amount;
		this.duration = duration;
		this.interestRate = interestRate;
	}

	
	public int getSchemaId() {
		return schemaId;
	}

	public void setSchemaId(int schemaId) {
		this.schemaId = schemaId;
	}

	public String getSchemes() {
		return schemes;
	}

	public void setSchemes(String schemes) {
		this.schemes = schemes;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	
	
	
}
