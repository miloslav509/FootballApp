package com.ftninformatika.rent.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.rent.model.Gol;
import com.ftninformatika.rent.service.GolService;
import com.ftninformatika.rent.service.IgracService;
import com.ftninformatika.rent.service.UtakmicaService;
import com.ftninformatika.rent.web.dto.GolDTO;

@Component
public class GolDtoToGol implements Converter<GolDTO, Gol> {

	@Autowired
	private GolService golService;
	
	@Autowired
	private IgracService igracService;
	
	@Autowired
	private UtakmicaService utakmicaService;
	
	@Override
	public Gol convert(GolDTO dto) {
		Gol gol;
		if (dto.getId() != null) {
			gol = golService.findOne(dto.getId());
		} else {
			gol = new Gol();
		}
		
		if (gol != null) {
			gol.setAsistent(igracService.findOne(dto.getAsistentId()));
			gol.setStrelacGola(igracService.findOne(dto.getStrelacId()));
			gol.setMinut(dto.getMinut());
			gol.setUtakmica(utakmicaService.findOne(dto.getUtakmicaId()));
		}
		
		return gol;
	}
}
