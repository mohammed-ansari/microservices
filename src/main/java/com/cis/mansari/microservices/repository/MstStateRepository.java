package com.cis.mansari.microservices.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cis.mansari.microservices.model.MstState;


public interface MstStateRepository extends CrudRepository<MstState, Long> {

	public List<MstState> findByStateName(String stateName);

}
