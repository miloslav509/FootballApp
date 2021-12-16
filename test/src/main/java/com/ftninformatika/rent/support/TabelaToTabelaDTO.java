package com.ftninformatika.rent.support;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.rent.model.Tabela;
import com.ftninformatika.rent.web.dto.TabelaDTO;

@Component
public class TabelaToTabelaDto implements Converter<Tabela, TabelaDTO> {

	@Override
	public TabelaDTO convert(Tabela tabela) {
		TabelaDTO dto = new TabelaDTO();
		
		dto.setId(tabela.getId());
		dto.setBodovi(tabela.getBodovi());
		dto.setKlubId(tabela.getKlub().getId());
		dto.setKlubNaziv(tabela.getKlub().getNaziv());
		dto.setNereseneUtakmice(tabela.getNereseneUtakmice());
		dto.setPobede(tabela.getPobede());
		dto.setPorazi(tabela.getPorazi());
		dto.setTakmicenjeNaziv(tabela.getTakmicenje().getNazivTakmicenja());
		
		return dto;
	}
	
	public List<TabelaDTO> convert(List<Tabela> tabele) {
		List<TabelaDTO> dto = new ArrayList<>();
		
		for (Tabela tabela : tabele) {
			dto.add(convert(tabela));
		}
		
		return dto;
	}
}
