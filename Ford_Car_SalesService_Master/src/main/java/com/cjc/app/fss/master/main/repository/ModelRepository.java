package com.cjc.app.fss.master.main.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cjc.app.fss.master.main.model.Model;



@Repository
public interface ModelRepository  extends CrudRepository<Model, Integer> {


	Model findByModelName(String modelName);

	Model findAllByModelNameAndModelType(String modelName, String modelType);

	Model findByModelId(int modelId);

	



	
	


	

    
}
