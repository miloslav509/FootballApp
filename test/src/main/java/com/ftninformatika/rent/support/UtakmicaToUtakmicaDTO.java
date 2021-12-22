package com.ftninformatika.rent.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.rent.model.Utakmica;
import com.ftninformatika.rent.web.dto.UtakmicaDTO;

@Component
public class UtakmicaToUtakmicaDto implements Converter<Utakmica, UtakmicaDTO> {

	@Autowired
	private GolToGolDto golToGolDTO;
	
	@Override
	public UtakmicaDTO convert(Utakmica utakmica) {
		UtakmicaDTO dto = new UtakmicaDTO();
		
		dto.setId(utakmica.getId());
		String datumVremeString = utakmica.getDatumIVreme().toString();
		datumVremeString = datumVremeString.replace("T", " ");
		dto.setDatumVreme(datumVremeString);
		dto.setDomacinId(utakmica.getKlubDomacin().getId());
		dto.setDomacinNaziv(utakmica.getKlubDomacin().getNaziv());
		dto.setGostId(utakmica.getKlubGost().getId());
		dto.setGostNaziv(utakmica.getKlubGost().getNaziv());
		dto.setKolo(utakmica.getKolo());
		dto.setTakmicenjeId(utakmica.getTakmicenje().getId());
		dto.setTakmicenjeNaziv(utakmica.getTakmicenje().getNazivTakmicenja());
		dto.setOdigrana(utakmica.isOdigrana());
		if (utakmica.isOdigrana()) {
			dto.setSuteviUGolGost(utakmica.getSuteviUGolGost());
			dto.setSuteviUGolDomacin(utakmica.getSuteviUGolDomacin());
			dto.setSuteviDomacin(utakmica.getSuteviDomacin());
			dto.setSuteviGost(utakmica.getSuteviGost());
			dto.setPosedDomacin(utakmica.getPosedDomacin());
			dto.setPosedGost(utakmica.getPosedGost());
			dto.setGolovi(golToGolDTO.convert(utakmica.getGolovi()));
			dto.setGoloviDomacin(utakmica.getGoloviDomacin());
			dto.setGoloviGost(utakmica.getGoloviGost());
		}
		
		return dto;
	}
	
	public List<UtakmicaDTO> convert(List<Utakmica> utakmice) {
		List<UtakmicaDTO> dto = new ArrayList<>();
		
		for (Utakmica utakmica : utakmice) {
			dto.add(convert(utakmica));
		}
		
		return dto;
	}
}
