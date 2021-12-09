package com.ftninformatika.rent.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.rent.model.Festival;
import com.ftninformatika.rent.service.FestivalService;
import com.ftninformatika.rent.service.MestoService;
import com.ftninformatika.rent.web.dto.FestivalDTO;

@Component
public class FestivalDtoToFestival implements Converter<FestivalDTO, Festival> {

	
	@Autowired
	private FestivalService festivalService;
	
	@Autowired
	private MestoService mestoService;

	@Override
	public Festival convert(FestivalDTO dto) {
		Festival festival;
		if (dto.getId() != null) {
			festival = festivalService.findOne(dto.getId());
		}else {
			festival = new Festival();
		}
		
		if (festival != null) {
			festival.setBrojKarata(dto.getBrojKarata());
			festival.setCena(dto.getCenaKarte());
			festival.setDatumPocetka(dto.getDatumPocetka());
			festival.setDatumZavrsetka(dto.getDatumZavrsetka());
			festival.setMesto(mestoService.findOne(dto.getMestoId()));
			festival.setNaziv(dto.getNaziv());
			
		}
		return festival;
	}
	
	
	
}
