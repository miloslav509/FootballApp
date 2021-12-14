package com.ftninformatika.rent.service;

import java.util.List;

import com.ftninformatika.rent.model.Utakmica;

public interface UtakmicaService {

	Utakmica findOne(Long id);
	
	List<Utakmica> findAll();
	
	List<Utakmica> findByTakmicenje(Long id);
	
	List<Utakmica> findByKlubDomacin(Long id);
	
	List<Utakmica> findByKlubGost(Long id);
	
	List<Utakmica> findByStadion(Long id);
	
	List<Utakmica> findByKolo(int kolo);
	
	List<Utakmica> findBySudija(Long id);
	
	Utakmica save(Utakmica utakmica);
	
	Utakmica update(Utakmica utakmica);
	
	Utakmica delete(Long id);
}
