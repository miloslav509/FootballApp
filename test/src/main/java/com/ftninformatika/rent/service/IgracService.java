package com.ftninformatika.rent.service;

import java.util.List;

import com.ftninformatika.rent.model.Igrac;

public interface IgracService {

	Igrac findOne(Long id);
	
	List<Igrac> findAll();
	
	List<Igrac> findByGolId(Long id);
	
	List<Igrac> findByAsistId(Long id);
	
	List<Igrac> findByKlubId(Long id);
	
	Igrac save(Igrac igrac);
	
	Igrac update(Igrac igrac);
	
	Igrac delete(Long id);
}
