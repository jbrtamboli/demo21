package com.cjc.app.fss.master.main.service;



import java.util.List;

import com.cjc.app.fss.master.main.model.Gstslab;
import com.cjc.app.fss.master.main.model.Insurance;
import com.cjc.app.fss.master.main.model.Make;
import com.cjc.app.fss.master.main.model.Model;

public interface HomeService {

	void makesavedata(Make mk, String modelName);

//	public List<Make> getMakedata(String makeName);

	void mdlsavedata(Model ml, int gstPer);

	//Model getModeldata(String modelName, String modelType);

	List<Model> getallModels();

	void isavedata(Insurance is);

	void savedgstata(Gstslab gs);

	

	void updatemodel(Model ml);

	void deletemodel(int modelId);

	List<Insurance> getallinsurances();

	void updateinsc(Insurance is);

	void deleteinsc(int inscId);

	List<Make> getallmake();

	void updatemake(Make mk);

	void deletemake(int makeId);

	List<Gstslab> getallgst();

	void updategst(Gstslab gs);

	void deletegst(int gstId);




	


	
	
	
	
	
	
	
}

	

