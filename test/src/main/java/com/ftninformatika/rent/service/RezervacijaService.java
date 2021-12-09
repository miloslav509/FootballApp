package com.ftninformatika.rent.service;

import com.ftninformatika.rent.model.Rezervacija;

public interface RezervacijaService {

	Rezervacija findOne(Long id);
	
	Rezervacija delete(Long id);
	
	Rezervacija save(Rezervacija rezervacija);
}
