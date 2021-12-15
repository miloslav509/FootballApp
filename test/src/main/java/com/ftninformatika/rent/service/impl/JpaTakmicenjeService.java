package com.ftninformatika.rent.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftninformatika.rent.model.Takmicenje;
import com.ftninformatika.rent.repository.TakmicenjeRepository;
import com.ftninformatika.rent.service.TakmicenjeService;

@Service
public class JpaTakmicenjeService implements TakmicenjeService {

	@Autowired
	private TakmicenjeRepository takmicenjeRepository;

	@Override
	public Takmicenje findOne(Long id) {
		
		return takmicenjeRepository.findById(id).get();
	}

	@Override
	public List<Takmicenje> findAll() {
		
		return takmicenjeRepository.findAll();
	}

	@Override
	public Takmicenje save(Takmicenje takmicenje) {
		
		return takmicenjeRepository.save(takmicenje);
	}

	@Override
	public Takmicenje update(Takmicenje takmicenje) {
		
		return takmicenjeRepository.save(takmicenje);
	}

	@Override
	public Takmicenje delete(Long id) {
		Takmicenje takmicenje = findOne(id);
		if (takmicenje != null) {
			takmicenjeRepository.delete(takmicenje);
			return takmicenje;
		}
		return null;
	}
	
	
}
