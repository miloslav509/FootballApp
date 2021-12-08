package com.ftninformatika.rent.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.rent.model.Festival;
import com.ftninformatika.rent.web.dto.FestivalDTO;

@Component
public class FestivalToFestivalDto implements Converter<Festival, FestivalDTO> {

	@Override
	public FestivalDTO convert(Festival s) {
		FestivalDTO dto = new FestivalDTO();
		dto.setId(s.getId());
		dto.setBrojKarata(s.getBrojKarata());
		dto.setCenaKarte(s.getCena());
		dto.setDatumPocetka(s.getDatumPocetka());
		dto.setDatumZavrsetka(s.getDatumZavrsetka());
		dto.setMestoId(s.getMesto().getId());
		dto.setMestoNaziv(s.getMesto().getGrad());
		dto.setNaziv(s.getNaziv());
		
		return dto;
	}
	
	public List<FestivalDTO> convert (List<Festival> festivali){
		List<FestivalDTO> dto = new ArrayList<>();
		
		for (Festival f : festivali) {
			dto.add(convert(f));
		}
		
		return dto;
	}

	
	
}
