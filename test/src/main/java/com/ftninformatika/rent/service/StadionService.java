package com.ftninformatika.rent.service;

import java.util.List;

import com.ftninformatika.rent.model.Stadion;

public interface StadionService {

	Stadion findOne(Long id);
	
	List<Stadion> findAll();
	
	Stadion save(Stadion stadion);
	
	Stadion update(Stadion stadion);
	
	Stadion delete(Long id);
	
	Stadion findByKlubId(Long id);
}
