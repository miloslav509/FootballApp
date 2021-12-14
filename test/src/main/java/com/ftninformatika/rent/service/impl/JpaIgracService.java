package com.ftninformatika.rent.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftninformatika.rent.model.Igrac;
import com.ftninformatika.rent.repository.IgracRepository;
import com.ftninformatika.rent.service.IgracService;

@Service
public class JpaIgracService implements IgracService {

	@Autowired
	private IgracRepository igracRepository;

	@Override
	public Igrac findOne(Long id) {
		
		return igracRepository.findById(id).get();
	}

	@Override
	public List<Igrac> findAll() {
		
		return igracRepository.findAll();
	}

	@Override
	public List<Igrac> findByGol(Long id) {
		
		return igracRepository.findByGolId(id);
	}

	@Override
	public List<Igrac> findByAsist(Long id) {
		
		return igracRepository.findByAsistId(id);
	}

	@Override
	public List<Igrac> findByKlub(Long id) {
		
		return igracRepository.findByKlubId(id);
	}

	@Override
	public Igrac save(Igrac igrac) {
	
		return igracRepository.save(igrac);
	}

	@Override
	public Igrac update(Igrac igrac) {
	
		return igracRepository.save(igrac);
	}

	@Override
	public Igrac delete(Long id) {
		Igrac igrac = findOne(id);
		if (igrac != null) {
			igracRepository.deleteById(id);
			return igrac;
		}
		return null;
	}
	
	
}
