package com.ftninformatika.rent.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.rent.model.Mesto;
import com.ftninformatika.rent.web.dto.MestoDTO;

@Component
public class MestoToMestoDto implements Converter<Mesto, MestoDTO> {

	@Override
	public MestoDTO convert(Mesto s) {
		MestoDTO dto = new MestoDTO();
		dto.setId(s.getId());
		dto.setMestoOdrzavanja(s.getGrad());
		return dto;
	}
	
	public List<MestoDTO> convert(List<Mesto> mesta){
		List<MestoDTO> dto = new ArrayList<>();
		for (Mesto m : mesta) {
			dto.add(convert(m));
		}
		
		return dto;
	}

	
}
