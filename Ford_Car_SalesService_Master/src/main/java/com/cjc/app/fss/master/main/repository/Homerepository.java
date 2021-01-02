package com.cjc.app.fss.master.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fss.master.main.model.Gstslab;

@Repository
public interface Homerepository extends CrudRepository<Gstslab, Integer>  {

	Gstslab findBygstPer(int gstPer);


		
	
}

