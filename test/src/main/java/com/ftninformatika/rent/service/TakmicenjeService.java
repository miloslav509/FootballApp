package com.ftninformatika.rent.service;

import java.util.List;

import com.ftninformatika.rent.model.Takmicenje;

public interface TakmicenjeService {

	Takmicenje findOne(Long id);
	
	List<Takmicenje> findAll();
	
	Takmicenje save(Takmicenje takmicenje);
	
	Takmicenje update(Takmicenje takmicenje);
	
	Takmicenje delete(Long id);
}
