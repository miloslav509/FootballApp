package com.ftninformatika.rent.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftninformatika.rent.model.Stadion;
import com.ftninformatika.rent.repository.StadionRepository;
import com.ftninformatika.rent.service.StadionService;

@Service
public class JpaStadionService implements StadionService {

	@Autowired
	private StadionRepository stadionRepository;

	@Override
	public Stadion findOne(Long id) {
	
		return stadionRepository.findById(id).get();
	}

	@Override
	public List<Stadion> findAll() {
	
		return stadionRepository.findAll();
	}

	@Override
	public Stadion save(Stadion stadion) {
	
		return stadionRepository.save(stadion);
	}

	@Override
	public Stadion update(Stadion stadion) {
	
		return stadionRepository.save(stadion);
	}

	@Override
	public Stadion delete(Long id) {
		Stadion stadion = findOne(id);
		if (stadion != null) {
			stadionRepository.deleteById(id);
			return stadion;
		}
		return null;
	}

	@Override
	public Stadion findByKlub(Long id) {
		
		return stadionRepository.findByKlubId(id);
	}
	
	
}
