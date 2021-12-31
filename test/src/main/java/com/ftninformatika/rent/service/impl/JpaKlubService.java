package com.ftninformatika.rent.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftninformatika.rent.model.Klub;
import com.ftninformatika.rent.repository.KlubRepository;
import com.ftninformatika.rent.service.KlubService;

@Service
public class JpaKlubService implements KlubService {

	@Autowired
	private KlubRepository klubRepository;

	@Override
	public Klub findOne(Long id) {

		return klubRepository.findById(id).get();
	}

	@Override
	public List<Klub> findAll() {
		
		return klubRepository.findAll();
	}

	@Override
	public Klub save(Klub klub) {
		
		return klubRepository.save(klub);
	}

	@Override
	public Klub update(Klub klub) {
	
		return klubRepository.save(klub);
	}

	@Override
	public Klub delete(Long id) {
		Klub klub = findOne(id);
		if (klub != null) {
			klubRepository.deleteById(id);
			return klub;
		}
		return null;	
	}

	@Override
	public List<Klub> findByStadion(Long id) {
		
		return null;
	}

	@Override
	public Klub findByIgrac(Long id) {
		
		return klubRepository.findByIgraciId(id);
	}
	
	
}
