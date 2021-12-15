package com.ftninformatika.rent.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftninformatika.rent.model.Trener;
import com.ftninformatika.rent.repository.TrenerRepository;
import com.ftninformatika.rent.service.TrenerService;

@Service
public class JpaTrenerService implements TrenerService {

	@Autowired
	private TrenerRepository trenerRepository;

	@Override
	public Trener findOne(Long id) {
		
		return trenerRepository.findById(id).get();
	}

	@Override
	public List<Trener> findAll() {
		
		return trenerRepository.findAll();
	}

	@Override
	public Trener findByKlub(Long id) {
		
		return trenerRepository.findByKlubId(id);
	}

	@Override
	public Trener save(Trener trener) {
		
		return trenerRepository.save(trener);
	}

	@Override
	public Trener update(Trener trener) {
		
		return trenerRepository.save(trener);
	}

	@Override
	public Trener delete(Long id) {
		Trener trener = findOne(id);
		if (trener != null) {
			trenerRepository.deleteById(id);
			return trener;
		}
		return null;
	}
	
	
}
