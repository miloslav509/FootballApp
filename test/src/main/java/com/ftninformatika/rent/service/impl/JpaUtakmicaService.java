package com.ftninformatika.rent.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ftninformatika.rent.model.Klub;
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
	public Page<Utakmica> findAllPage(int pageNo) {
		
		return utakmicaRepository.findAll(PageRequest.of(pageNo, 5));
	}

	@Override
	public List<Utakmica> findByTakmicenje(Long id) {
		
		return utakmicaRepository.findByTakmicenjeId(id);
	}

	@Override
	public List<Utakmica> findByKlubDomacin(Long id) {
		
		return utakmicaRepository.findByKlubDomacinId(id);
	}

	@Override
	public List<Utakmica> findByKlubGost(Long id) {
		
		return utakmicaRepository.findByKlubGostId(id);
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
		
		Klub domacin = utakmica.getKlubDomacin();
		
		Klub gost = utakmica.getKlubGost();
		
		if (domacin.equals(gost)) {
			return null;
		}
		
		List<Utakmica> sveUtakmice = findAll();
		
		for (Utakmica utakmica2 : sveUtakmice) {
			if (utakmica2.getKlubDomacin().equals(domacin) && utakmica2.getKlubGost().equals(gost)) {
				
				return null;
			}
		}
		
		return utakmicaRepository.save(utakmica);
	}

	@Override
	public Utakmica update(Utakmica utakmica) {
		utakmica.setOdigrana(true);
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

	@Override
	public List<Utakmica> findAll() {
		return utakmicaRepository.findAll();
	}
	
	
}
