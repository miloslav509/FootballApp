package com.ftninformatika.rent.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftninformatika.rent.model.Gol;
import com.ftninformatika.rent.repository.GolRepository;
import com.ftninformatika.rent.service.GolService;

@Service
public class JpaGolService implements GolService {

	@Autowired
	private GolRepository golRepository;

	@Override
	public Gol findOne(Long id) {
		
		return golRepository.findById(id).get();
	}

	@Override
	public List<Gol> findAll() {
		
		return golRepository.findAll();
	}

	@Override
	public List<Gol> findByStrelac(Long id) {
		
		return golRepository.findByStrelacGolaId(id);
	}

	@Override
	public List<Gol> findByAsistent(Long id) {
		
		return golRepository.findByAsistentId(id);
	}

	@Override
	public List<Gol> findByUtakmica(Long id) {
		
		return golRepository.findByUtakmicaId(id);
	}

	@Override
	public Gol save(Gol gol) {
		
		return golRepository.save(gol);
	}

	@Override
	public Gol update(Gol gol) {
		
		return golRepository.save(gol);
	}

	@Override
	public Gol delete(Long id) {
		Gol gol = findOne(id);
		if (gol != null) {
			golRepository.deleteById(id);
			return gol;
		}
		return null;
	}
	
	
}
