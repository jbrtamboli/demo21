package com.cjc.app.fss.master.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Insurance {

	
	  @Id
      private int inscId;
	  private String inscName;
	  private int inscDuration;
	  private int inscCost;
	  private int inscCompRegCode;
	
	  
	  public int getInscId() {
		return inscId;
	}
	public void setInscId(int inscId) {
		this.inscId = inscId;
	}
	public String getInscName() {
		return inscName;
	}
	public void setInscName(String inscName) {
		this.inscName = inscName;
	}
	public int getInscDuration() {
		return inscDuration;
	}
	public void setInscDuration(int inscDuration) {
		this.inscDuration = inscDuration;
	}
	public int getInscCost() {
		return inscCost;
	}
	public void setInscCost(int inscCost) {
		this.inscCost = inscCost;
	}
	public int getInscCompRegCode() {
		return inscCompRegCode;
	}
	public void setInscCompRegCode(int inscCompRegCode) {
		this.inscCompRegCode = inscCompRegCode;
	}

	  
	  	
	  
	 
   
	  






}
