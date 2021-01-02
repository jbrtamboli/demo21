package com.cjc.app.fss.master.main.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;




@Entity
public class Make {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int makeId;
	private  String makeName;
	private String makeDesc;


	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="makeId")
     private List<Model> model;
	

	public List<Model> getModel() {
		return model;
	}
	public void setModel(List<Model> model) {
		this.model = model;
	}
	
    public int getMakeId() {
		return makeId;
	}
	public void setMakeId(int makeId) {
		this.makeId = makeId;
	}
	public String getMakeName() {
		return makeName;
	}
	public void setMakeName(String makeName) {
		this.makeName = makeName;
	}
	public String getMakeDesc() {
		return makeDesc;
	}
	public void setMakeDesc(String makeDesc) {
		this.makeDesc = makeDesc;
	}
	
	
	
	
}
