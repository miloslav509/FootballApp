package com.ftninformatika.rent.service;

import java.util.List;

import com.ftninformatika.rent.model.Sudija;

public interface SudijaService {

	Sudija findOne(Long id);
	
	List<Sudija> findAll();
	
	Sudija save(Sudija sudija);
	
	Sudija update(Sudija sudija);
	
	Sudija delete(Long id);
	
	Sudija findByUtakmica(Long id);
}
