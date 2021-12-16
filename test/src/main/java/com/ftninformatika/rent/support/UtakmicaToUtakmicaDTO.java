package com.ftninformatika.rent.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.rent.model.Utakmica;
import com.ftninformatika.rent.web.dto.UtakmicaDTO;

@Component
public class UtakmicaToUtakmicaDTO implements Converter<Utakmica, UtakmicaDTO> {

	@Autowired
	private GolToGolDTO golToGolDTO;
	
	@Override
	public UtakmicaDTO convert(Utakmica utakmica) {
		UtakmicaDTO dto = new UtakmicaDTO();
		
		dto.setId(utakmica.getId());
		dto.setDatumVreme(utakmica.getDatumIVreme().toString());
		dto.setDomacinId(utakmica.getKlubDomacin().getId());
		dto.setDomacinNaziv(utakmica.getKlubDomacin().getNaziv());
		dto.setGostId(utakmica.getKlubGost().getId());
		dto.setGostNaziv(utakmica.getKlubGost().getNaziv());
		dto.setGolovi(golToGolDTO.convert(utakmica.getGolovi()));
		dto.setGoloviDomacin(utakmica.getGoloviDomacin());
		dto.setGoloviGost(utakmica.getGoloviGost());
		return null;
	}
}
