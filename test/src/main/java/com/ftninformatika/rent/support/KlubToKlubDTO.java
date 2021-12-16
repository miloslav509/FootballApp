package com.ftninformatika.rent.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.rent.model.Klub;
import com.ftninformatika.rent.web.dto.KlubDTO;

@Component
public class KlubToKlubDto implements Converter<Klub, KlubDTO> {

	@Autowired
	private IgracToIgracDto igracToIgracDTO;
	
	@Override
	public KlubDTO convert(Klub klub) {
		KlubDTO dto = new KlubDTO();
		
		dto.setId(klub.getId());
		dto.setNaziv(klub.getNaziv());
		dto.setStadionId(klub.getStadion().getId());
		dto.setStadionNaziv(klub.getStadion().getNaziv());
		dto.setTrenerId(klub.getTrener().getId());
		String trener = klub.getTrener().getIme() + " " + klub.getTrener().getPrezime();
		dto.setTrenerImePrezime(trener);
		dto.setIgraci(igracToIgracDTO.conver(klub.getIgraci()));
		
		return dto;
	}
	
	public List<KlubDTO> conver(List<Klub> klubovi) {
		List<KlubDTO> dto = new ArrayList<>();
		
		for (Klub klub : klubovi) {
			dto.add(convert(klub));
		}
		
		return dto;
	}

	
}
