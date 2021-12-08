package com.ftninformatika.rent.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.rent.model.Rezervacija;
import com.ftninformatika.rent.service.FestivalService;
import com.ftninformatika.rent.service.RezervacijaService;
import com.ftninformatika.rent.web.dto.RezervacijaDTO;

@Component
public class RezervacijaDtoToRezervacija implements Converter<RezervacijaDTO, Rezervacija> {

	@Autowired
	private RezervacijaService rezervacijaService;
	
	@Autowired
	private FestivalService festivalService;

	@Override
	public Rezervacija convert(RezervacijaDTO dto) {
		Rezervacija rezervacija;
		if (dto.getId() != null) {
			rezervacija = rezervacijaService.findOne(dto.getId());
		}else {
			rezervacija = new Rezervacija();
		}
		
		if (rezervacija != null) {
			rezervacija.setBrojKarata(dto.getBrojKarata());
			rezervacija.setFestival(festivalService.findOne(dto.getFestivalId()));
			rezervacija.setUkupnaCena(dto.getUkupnaCena());
		}
		return rezervacija;
	};
	
	
	
}
