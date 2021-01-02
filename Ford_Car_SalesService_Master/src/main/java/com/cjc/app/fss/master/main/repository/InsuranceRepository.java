package com.cjc.app.fss.master.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.fss.master.main.model.Insurance;


@Repository
public interface InsuranceRepository extends CrudRepository<Insurance, Integer> {

	
}
