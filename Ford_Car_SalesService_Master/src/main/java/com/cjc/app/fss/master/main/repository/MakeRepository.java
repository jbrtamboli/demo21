package com.cjc.app.fss.master.main.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fss.master.main.model.Make;




@Repository
public interface MakeRepository  extends CrudRepository<Make, Integer>{

	Make findAllByMakeName(String makeName);

		
	

	

	














	



}
