package com.ftninformatika.rent.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.rent.model.Gol;
import com.ftninformatika.rent.web.dto.GolDTO;

@Component
public class GolToGolDto implements Converter<Gol, GolDTO> {

	@Override
	public GolDTO convert(Gol gol) {
		GolDTO dto = new GolDTO();
		
		if (gol.getAsistent() != null) {
			dto.setAsistentId(gol.getAsistent().getId());
			dto.setAsistentIme(gol.getAsistent().getIme());
			dto.setAsistentPrezime(gol.getAsistent().getPrezime());
		}
		
		dto.setId(gol.getId());
		dto.setMinut(gol.getMinut());
		dto.setStrelacId(gol.getStrelacGola().getId());
		dto.setStrelacIme(gol.getStrelacGola().getIme());
		dto.setStrelacPrezime(gol.getStrelacGola().getPrezime());
		dto.setUtakmicaId(gol.getUtakmica().getId());
		String utakmica = gol.getUtakmica().getKlubDomacin().getNaziv() + " - " + gol.getUtakmica().getKlubGost().getNaziv();
		dto.setUtakmicaNaziv(utakmica);
		return dto;
	}

	public List<GolDTO> convert(List<Gol> golovi) {
		List<GolDTO> dto = new ArrayList<>();
		for(Gol gol : golovi) {
			dto.add(convert(gol));
		}
		
		return dto;
	}
	
}
