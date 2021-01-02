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

import com.cjc.app.fss.master.main.model.Insurance;
import com.cjc.app.fss.master.main.service.HomeService;

@CrossOrigin("*")
@RestController
public class InsuranceController {

	
	
	@Autowired
	   HomeService hs;
	
	
	   @PostMapping("/addins")
	   public void insertinsdata(@RequestBody Insurance is)
	   
	   {
		  
		   hs.isavedata(is);
		 
		   
	   }

     @GetMapping("/getins")  	   
	  public List<Insurance> getallinsurances()
			{
				 
			     List<Insurance> lins=hs.getallinsurances();
			     return lins;
			   
	 		}
			   
	   @PutMapping("/updateins")
	   public void updateinsc(@RequestBody Insurance is)
	   {
		   
		   
		   hs.updateinsc(is);
		   
	   }
     
     
	   @DeleteMapping("/deleteins/{inscId}")
	   public void deleteinsc(@PathVariable int inscId)
	   {
		   
		   hs.deleteinsc(inscId);
	   }
	   
	   
     
     
     
     
	   
	
	}
