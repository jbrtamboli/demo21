package com.cjc.app.fss.master.main.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.fss.master.main.model.Gstslab;
import com.cjc.app.fss.master.main.model.Insurance;
import com.cjc.app.fss.master.main.model.Make;
import com.cjc.app.fss.master.main.model.Model;
import com.cjc.app.fss.master.main.repository.Homerepository;
import com.cjc.app.fss.master.main.repository.InsuranceRepository;
import com.cjc.app.fss.master.main.repository.MakeRepository;
import com.cjc.app.fss.master.main.repository.ModelRepository;
import com.cjc.app.fss.master.main.service.HomeService;


@Service
public class Homeserviceimpl implements HomeService {

	@Autowired
	Homerepository hr;
	
	@Autowired
	InsuranceRepository ir;
	
	@Autowired
	MakeRepository mkr;
	
	@Autowired
	ModelRepository mdr;

	@Override
	public void makesavedata(Make mk,String modelName) {
		
	  System.out.println("Model name"+modelName);
	  Model ml= mdr.findByModelName(modelName);
	   List<Model> lmodel=new ArrayList<Model>();
	   lmodel.add(ml);
	   mk.setModel(lmodel);
        mkr.save(mk);
	  
	} 


	
	/*@Override
	public List<Make> getMakedata(String makeName) {
		
		
		List<Make> mk=(List<Make>) mkr.findAllByMakeName(makeName);
		return mk;
		

	}  */

	@Override
	public void mdlsavedata(Model ml, int gstPer) {
		
	 Gstslab gs= hr.findBygstPer(gstPer);
	  ml.setGslb(gs);
	 
		mdr.save(ml);
		
	}

	/*@Override
	public Model getModeldata(String modelName, String modelType) {
		
		
		return mdr.findAllByModelNameAndModelType(modelName,modelType);
		
	}*/



	@Override
	public List<Model> getallModels() {


      List<Model> lmodel =(List<Model>)mdr.findAll();
      return lmodel;
	
	}

	@Override
	public void isavedata(Insurance is) {
		
		ir.save(is);
		
	}

	@Override
	public void savedgstata(Gstslab gs) {
		
		hr.save(gs);
		
	}

	@Override
	public void updatemodel(Model ml) {
		
		mdr.save(ml);
		
	}

	@Override
	public void deletemodel(int modelId) {
		
		mdr.deleteById(modelId);
		
		
	}

	@Override
	public List<Insurance> getallinsurances() {


		 List<Insurance> lins= (List<Insurance>)ir.findAll();
		 return lins;
	
	}

	@Override
	public void updateinsc(Insurance is) {
		
		
		ir.save(is);
	}

	@Override
	public void deleteinsc(int inscId) {
		
		ir.deleteById(inscId);
		
	}


	@Override
	public List<Make> getallmake() {
		
		List<Make> lmake=(List<Make>) mkr.findAll();
		return lmake;
		
	}



	@Override
	public void updatemake(Make mk) {
		
		mkr.save(mk);
		
	}



	@Override
	public void deletemake(int makeId) {
		
		mkr.deleteById(makeId);
		
	}



	@Override
	public List<Gstslab> getallgst() {
		
		
	  return (List<Gstslab>)hr.findAll();
		
	}



	@Override
	public void updategst(Gstslab gs) {
		
		hr.save(gs);
	}



	@Override
	public void deletegst(int gstId) {
		
		
		hr.deleteById(gstId);
	}
	
	

	
	
	
}
	


	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	


	
   
	
	


