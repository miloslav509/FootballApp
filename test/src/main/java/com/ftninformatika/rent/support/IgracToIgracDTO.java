package com.ftninformatika.rent.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.rent.model.Igrac;
import com.ftninformatika.rent.web.dto.IgracDTO;

@Component
public class IgracToIgracDto implements Converter<Igrac, IgracDTO> {

	@Autowired
	private GolToGolDto golToGolDTO;
	
	@Override
	public IgracDTO convert(Igrac igrac) {
		IgracDTO dto = new IgracDTO();
		
		dto.setId(igrac.getId());
		dto.setGolovi(golToGolDTO.convert(igrac.getGolovi()));
		dto.setAsistencije(golToGolDTO.convert(igrac.getAsistencije()));
		dto.setIme(igrac.getIme());
		dto.setPrezime(igrac.getPrezime());
		dto.setPozicija(igrac.getPozicija());
		dto.setKlubNaziv(igrac.getKlub().getNaziv());
		dto.setKlubId(igrac.getKlub().getId());
		dto.setBroj(igrac.getBroj());
		
		return dto;
	}
	
	public List<IgracDTO> conver(List<Igrac> igraci) {
		List<IgracDTO> dto = new ArrayList<>();
		
		for (Igrac igrac : igraci) {
			dto.add(convert(igrac));
		}
		
		return dto;
	}

	
}
