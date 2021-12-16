package com.ftninformatika.rent.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.rent.model.Komentar;
import com.ftninformatika.rent.web.dto.KomentarDTO;

@Component
public class KomentarToKomentarDTO implements Converter<Komentar, KomentarDTO> {

	@Override
	public KomentarDTO convert(Komentar komentar) {
		KomentarDTO dto = new KomentarDTO();
		
		dto.setId(komentar.getId());
		dto.setKorisnikId(komentar.getKorisnik().getId());
		dto.setKorisnikKorisnickoIme(komentar.getKorisnik().getKorisnickoIme());
		dto.setSadrzaj(komentar.getSadrzaj());
		dto.setUtakmicaId(komentar.getUtakmica().getId());
		dto.setDatumVreme(komentar.getDatumIVreme().toString());
		
		return dto;
	}
	
	public List<KomentarDTO> convert(List<Komentar> komentari) {
		List<KomentarDTO> dto = new ArrayList<>();
		
		for (Komentar komentar : komentari) {
			dto.add(convert(komentar));
		}
		
		return dto;
	}
}
