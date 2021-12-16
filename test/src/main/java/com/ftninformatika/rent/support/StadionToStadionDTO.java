package com.ftninformatika.rent.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.rent.model.Stadion;
import com.ftninformatika.rent.web.dto.StadionDTO;

@Component
public class StadionToStadionDTO implements Converter<Stadion, StadionDTO> {

	@Override
	public StadionDTO convert(Stadion stadion) {
		StadionDTO dto = new StadionDTO();
		
		dto.setId(stadion.getId());
		dto.setDrzava(stadion.getDrzava());
		dto.setGrad(stadion.getGrad());
		dto.setNaziv(stadion.getNaziv());
		dto.setKapacitet(stadion.getKapacitet());
		dto.setKlubId(stadion.getKlub().getId());
		dto.setKlubNaziv(stadion.getKlub().getNaziv());
		
		return dto;
	}
	
	public List<StadionDTO> convert(List<Stadion> stadioni) {
		List<StadionDTO> dto = new ArrayList<>();
		
		for (Stadion stadion : stadioni) {
			dto.add(convert(stadion));
		}
		
		return dto;
	}
}
