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
import com.cjc.app.fss.master.main.model.Gstslab;
import com.cjc.app.fss.master.main.service.HomeService;

@CrossOrigin("*")
@RestController
public class GstController {

	
	  @Autowired
	   HomeService hs;
	
	
	  @PostMapping("/addgst")
	   public String insertgstdata(@RequestBody Gstslab gs)
	   
	   {
		
		   System.out.println("gst data:" +gs);
		   hs.savedgstata(gs);
		   return "gst data inserted successfully";
	   }

	  
	  @GetMapping("/getgst")  	   
		public List<Gstslab> getallGst()
		{
			 
		     List<Gstslab> lgst=hs.getallgst();
		     return lgst;
		   
		}
	  
	  @PutMapping("/updategst")
	   public void updategst(@RequestBody Gstslab gs)
	   {
		   
		   	   hs.updategst(gs);
		   
	   }
    
    
	   @DeleteMapping("/deletegst/{gstId}")
	   public void deletegst(@PathVariable int gstId)
	   {
		   
		   hs.deletegst(gstId);
	   }
	   
	  
	  
	  

}


