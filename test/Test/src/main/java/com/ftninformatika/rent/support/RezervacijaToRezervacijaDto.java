package com.ftninformatika.rent.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.rent.model.Festival;
import com.ftninformatika.rent.model.Rezervacija;
import com.ftninformatika.rent.web.dto.FestivalDTO;
import com.ftninformatika.rent.web.dto.RezervacijaDTO;

@Component
public class RezervacijaToRezervacijaDto implements Converter<Rezervacija, RezervacijaDTO> {

	@Override
	public RezervacijaDTO convert(Rezervacija s) {
		RezervacijaDTO dto = new RezervacijaDTO();
		dto.setId(s.getId());
		dto.setBrojKarata(s.getBrojKarata());
		dto.setFestivalId(s.getFestival().getId());
		dto.setUkupnaCena(s.getUkupnaCena());
		return dto;
	}

	public List<RezervacijaDTO> convert (List<Rezervacija> lista){
		List<RezervacijaDTO> dto = new ArrayList<>();
		for (Rezervacija r : lista) {
			dto.add(convert(r));
		}
		
		return dto;
	}
	
	
}
