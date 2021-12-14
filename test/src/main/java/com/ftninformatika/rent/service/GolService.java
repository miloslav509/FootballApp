package com.ftninformatika.rent.service;

import java.util.List;

import com.ftninformatika.rent.model.Gol;

public interface GolService {

	Gol findOne(Long id);
	
	List<Gol> findAll();
	
	List<Gol> findByStrelac(Long id);
	
	List<Gol> findByAsistent(Long id);
	
	List<Gol> findByUtakmica(Long id);
	
	Gol save(Gol gol);
	
	Gol update(Gol gol);
	
	Gol delete(Long id);
}
