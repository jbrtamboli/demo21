package com.cjc.app.fss.master.main.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gstslab {

	      @Id  
	      @GeneratedValue(strategy = GenerationType.IDENTITY)
	      private int gstId;
	      private int gstPer;
	      private String gstDesc;
	      private int stateId;
	      private int gstStatus;
		
	      
	      public int getGstId() {
			return gstId;
		}
		public int getGstPer() {
			return gstPer;
		}
		public void setGstPer(int gstPer) {
			this.gstPer = gstPer;
		}
		public void setGstId(int gstId) {
			this.gstId = gstId;
		}
		
		public String getGstDesc() {
			return gstDesc;
		}
		public void setGstDesc(String gstDesc) {
			this.gstDesc = gstDesc;
		}
		public int getStateId() {
			return stateId;
		}
		public void setStateId(int stateId) {
			this.stateId = stateId;
		}
		public int getGstStatus() {
			return gstStatus;
		}
		public void setGstStatus(int gstStatus) {
			this.gstStatus = gstStatus;
		}
		
	      
	    
	      
	      
		}
