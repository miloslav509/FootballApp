package com.ftninformatika.rent.service;

import java.util.List;

import com.ftninformatika.rent.model.Igrac;

public interface IgracService {

	Igrac findOne(Long id);
	
	List<Igrac> findAll();
	
	List<Igrac> findByGol(Long id);
	
	List<Igrac> findByAsist(Long id);
	
	List<Igrac> findByKlub(Long id);
	
	Igrac save(Igrac igrac);
	
	Igrac update(Igrac igrac);
	
	Igrac delete(Long id);
}
