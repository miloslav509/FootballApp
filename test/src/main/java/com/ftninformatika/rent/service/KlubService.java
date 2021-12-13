package com.ftninformatika.rent.service;

import java.util.List;

import com.ftninformatika.rent.model.Klub;

public interface KlubService {

	Klub findOne(Long id);
	
	List<Klub> findAll();
	
	Klub save(Klub klub);
	
	Klub update(Klub klub);
	
	Klub delete(Long id);
	
	List<Klub> findByStadionId(Long id);
}
