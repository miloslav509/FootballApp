package com.ftninformatika.rent.service;

import java.util.List;

import com.ftninformatika.rent.model.Mesto;

public interface MestoService {

	Mesto findOne(Long id);
	
	List<Mesto> findAll();
	
	Mesto save (Mesto m);
	
	Mesto delete(Long id);
}
