package com.ftninformatika.rent.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.rent.model.Sudija;
import com.ftninformatika.rent.web.dto.SudijaDTO;

@Component
public class SudijaToSudijaDTO implements Converter<Sudija, SudijaDTO> {

	@Override
	public SudijaDTO convert(Sudija sudija) {
		SudijaDTO dto = new SudijaDTO();
		
		dto.setId(sudija.getId());
		dto.setIme(sudija.getIme());
		dto.setPrezime(sudija.getPrezime());
		
		return dto;
	}
	
	public List<SudijaDTO> convert(List<Sudija> sudije) {
		List<SudijaDTO> dto = new ArrayList<>();
		
		for (Sudija sudija : sudije) {
			dto.add(convert(sudija));
		}
		
		return dto;
	}
}
