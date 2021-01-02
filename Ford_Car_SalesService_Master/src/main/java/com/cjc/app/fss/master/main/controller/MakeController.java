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
import com.cjc.app.fss.master.main.model.Make;
import com.cjc.app.fss.master.main.service.HomeService;


@CrossOrigin("*")
@RestController
public class MakeController {

	
	@Autowired
	   HomeService hs;
	
	@PostMapping("/addmakeid/{modelName}")
	   public String insertmakedata(@RequestBody Make mk,@PathVariable("modelName")String modelName )
	   
	   {
		  System.out.println("Make data inserted:"+mk);
		   hs.makesavedata(mk,modelName);
		   return "make data inserted successfully";
	   }


	   
	   @GetMapping("/getmk")  	   
		public List<Make> getallmake()
		{
			 
		     List<Make> lmake=hs.getallmake();
		     return lmake;
		   
		}
	     
	   @PutMapping("/updatemake")
	   public void updatemmake(@RequestBody Make mk)
	   {
		   
		   
		   hs.updatemake(mk);
		   
	   }
	  
	   
	   
	   @DeleteMapping("/deletemake/{makeId}")
	   public void deletemake(@PathVariable int makeId)
	   {
		   
		   hs.deletemake(makeId);
	   }
	   
	   
	   
}
