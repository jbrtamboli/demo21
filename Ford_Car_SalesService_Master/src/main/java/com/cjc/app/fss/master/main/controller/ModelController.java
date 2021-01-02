package com.cjc.app.fss.master.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.fss.master.main.model.Model;
import com.cjc.app.fss.master.main.service.HomeService;

@CrossOrigin("*")
@RestController
public class ModelController {


	@Autowired
	   HomeService hs;
	
	
   
	   @PostMapping("/addmodel/{gstPer}")
	   public void insertmodeldata(@RequestBody Model ml,@PathVariable("gstPer")int gstPer) 
	   
	   {
		   System.out.println("Model inserted:" +ml);
           hs.mdlsavedata(ml,gstPer);
		   
	   }

	   @GetMapping("/getmodels")  	   
		public List<Model> getallModels()
		{
			 
		     List<Model> lmodel=hs.getallModels();
		     return lmodel;
		   
 		}
		
	   @PutMapping("/updatemodel")
	   public void updatemodel(@RequestBody Model ml)
	   {
		   
		   
		   hs.updatemodel(ml);
		   
	   }
	   
	   @DeleteMapping("/deletemodel/{modelId}")
	   public void deletemodel(@PathVariable int modelId)
	   {
		   
		   hs.deletemodel(modelId);
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}