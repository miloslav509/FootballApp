package com.ftninformatika.rent.service;

import java.util.List;

import com.ftninformatika.rent.model.Gol;

public interface GolService {

	Gol findOne(Long id);
	
	List<Gol> findAll();
	
	List<Gol> findByStrelacId(Long id);
	
	List<Gol> findByAsistentId(Long id);
	
	List<Gol> findByUtakmicaId(Long id);
	
	Gol save(Gol gol);
	
	Gol update(Gol gol);
	
	Gol delete(Long id);
}
