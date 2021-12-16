package com.ftninformatika.rent.service;

import java.util.List;

import com.ftninformatika.rent.model.Komentar;

public interface KomentarService {

	Komentar findOne(Long id);
	
	List<Komentar> findAll();
	
	List<Komentar> findByKorisnik(Long id);
	
	List<Komentar> findByUtakmica(Long id);
	
	Komentar save(Komentar komentar);
	
	Komentar update(Komentar komentar);
	
	Komentar delete(Long id);
}
