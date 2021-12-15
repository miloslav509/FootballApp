package com.ftninformatika.rent.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftninformatika.rent.model.Utakmica;
import com.ftninformatika.rent.repository.UtakmicaRepository;
import com.ftninformatika.rent.service.UtakmicaService;

@Service
public class JpaUtakmicaService implements UtakmicaService {

	@Autowired
	private UtakmicaRepository utakmicaRepository;

	@Override
	public Utakmica findOne(Long id) {
		
		return utakmicaRepository.findById(id).get();
	}

	@Override
	public List<Utakmica> findAll() {
		
		return utakmicaRepository.findAll();
	}

	@Override
	public List<Utakmica> findByTakmicenje(Long id) {
		
		return utakmicaRepository.findByTakmicenjeId(id);
	}

	@Override
	public List<Utakmica> findByKlubDomacin(Long id) {
		
		return utakmicaRepository.findByDomacinId(id);
	}

	@Override
	public List<Utakmica> findByKlubGost(Long id) {
		
		return utakmicaRepository.findByGostId(id);
	}

	@Override
	public List<Utakmica> findByStadion(Long id) {
		
		return utakmicaRepository.findByStadionId(id);
	}

	@Override
	public List<Utakmica> findByKolo(int kolo) {
		
		return utakmicaRepository.findByKolo(kolo);
	}

	@Override
	public List<Utakmica> findBySudija(Long id) {
		
		return utakmicaRepository.findBySudijaId(id);
	}

	@Override
	public Utakmica save(Utakmica utakmica) {
		
		return utakmicaRepository.save(utakmica);
	}

	@Override
	public Utakmica update(Utakmica utakmica) {
		
		return utakmicaRepository.save(utakmica);
	}

	@Override
	public Utakmica delete(Long id) {
		Utakmica utakmica = findOne(id);
		if (utakmica != null) {
			utakmicaRepository.deleteById(id);
			return utakmica;
		}
		return null;
	}
	
	
}
