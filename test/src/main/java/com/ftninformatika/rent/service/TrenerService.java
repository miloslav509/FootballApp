package com.ftninformatika.rent.service;

import java.util.List;

import com.ftninformatika.rent.model.Trener;

public interface TrenerService {

	Trener findOne(Long id);
	
	List<Trener> findAll();
	
	Trener findByKlub(Long id);
	
	Trener save(Trener trener);
	
	Trener update(Trener trener);
	
	Trener delete(Long id);
}
