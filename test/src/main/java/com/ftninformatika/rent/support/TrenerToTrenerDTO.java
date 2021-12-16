package com.ftninformatika.rent.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.rent.model.Trener;
import com.ftninformatika.rent.web.dto.TrenerDTO;

@Component
public class TrenerToTrenerDTO implements Converter<Trener, TrenerDTO> {

	@Override
	public TrenerDTO convert(Trener trener) {
		TrenerDTO dto = new TrenerDTO();
		
		dto.setId(trener.getId());
		dto.setIme(trener.getIme());
		dto.setPrezime(trener.getPrezime());
		dto.setKlubId(trener.getKlub().getId());
		dto.setKlubNaziv(trener.getKlub().getNaziv());
		
		return dto;
	}
	
	public List<TrenerDTO> conver(List<Trener> treneri) {
		List<TrenerDTO> dto = new ArrayList<>();
		
		for (Trener trener : treneri) {
			dto.add(convert(trener));
		}
		
		return dto;
	}
}
