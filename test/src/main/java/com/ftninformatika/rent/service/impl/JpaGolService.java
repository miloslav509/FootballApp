package com.ftninformatika.rent.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftninformatika.rent.model.Gol;
import com.ftninformatika.rent.model.Klub;
import com.ftninformatika.rent.model.Utakmica;
import com.ftninformatika.rent.repository.GolRepository;
import com.ftninformatika.rent.service.GolService;
import com.ftninformatika.rent.service.UtakmicaService;

@Service
public class JpaGolService implements GolService {

	@Autowired
	private GolRepository golRepository;
	
	@Autowired
	private UtakmicaService utakmicaService;

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
		Utakmica utakmica = gol.getUtakmica();
		Klub domacin = utakmica.getKlubDomacin();
		Klub gost = utakmica.getKlubGost();
		Klub igracKlub = gol.getStrelacGola().getKlub();
		
		if (domacin.equals(igracKlub)) {
			utakmica.setGoloviDomacin(utakmica.getGoloviDomacin() + 1);
		} else {
			utakmica.setGoloviGost(utakmica.getGoloviGost() + 1);
		}
		utakmica.setOdigrana(true);
		utakmicaService.update(utakmica);
		
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
