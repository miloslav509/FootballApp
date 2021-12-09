package com.ftninformatika.rent.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftninformatika.rent.model.Festival;
import com.ftninformatika.rent.model.Rezervacija;
import com.ftninformatika.rent.repository.RezervacijaRepository;
import com.ftninformatika.rent.service.FestivalService;
import com.ftninformatika.rent.service.RezervacijaService;

@Service
public class JpaRezervacijaService implements RezervacijaService {

	
	@Autowired
	private RezervacijaRepository rezervacijaRepository;
	
	@Autowired
	private FestivalService festivalService;

	@Override
	public Rezervacija findOne(Long id) {
		// TODO Auto-generated method stub
		return rezervacijaRepository.findById(id).get();
	}

	@Override
	public Rezervacija delete(Long id) {
		Rezervacija rezervacija = findOne(id);
		if (rezervacija != null) {
			Festival festival = rezervacija.getFestival();
			festival.getRezervacije().remove(rezervacija);
			festivalService.save(festival);
			rezervacijaRepository.delete(rezervacija);
			return rezervacija;
		}
		return null;
	}

	@Override
	public Rezervacija save(Rezervacija rezervacija) {
		// TODO Auto-generated method stub
		return rezervacijaRepository.save(rezervacija);
	};
	
	
	
}
