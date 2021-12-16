package com.ftninformatika.rent.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftninformatika.rent.model.Komentar;
import com.ftninformatika.rent.repository.KomentarRepository;
import com.ftninformatika.rent.service.KomentarService;

@Service
public class JpaKomentarService implements KomentarService {

	@Autowired
	private KomentarRepository komentarRepository;

	@Override
	public Komentar findOne(Long id) {
		
		return komentarRepository.findById(id).get();
	}

	@Override
	public List<Komentar> findAll() {
		
		return komentarRepository.findAll();
	}

	@Override
	public List<Komentar> findByKorisnik(Long id) {
		
		return komentarRepository.findByKorisnikId(id);
	}

	@Override
	public List<Komentar> findByUtakmica(Long id) {
		
		return komentarRepository.findByUtakmicaId(id);
	}

	@Override
	public Komentar save(Komentar komentar) {
		
		return komentarRepository.save(komentar);
	}

	@Override
	public Komentar update(Komentar komentar) {
		
		return komentarRepository.save(komentar);
	}

	@Override
	public Komentar delete(Long id) {
		Komentar komentar = findOne(id);
		if (komentar != null) {
			komentarRepository.deleteById(id);
			return komentar;
		}
		return null;
	}
	
	
}
