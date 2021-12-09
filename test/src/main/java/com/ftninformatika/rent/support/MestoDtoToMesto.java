package com.ftninformatika.rent.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.rent.model.Mesto;
import com.ftninformatika.rent.service.MestoService;
import com.ftninformatika.rent.web.dto.MestoDTO;

@Component
public class MestoDtoToMesto implements Converter<MestoDTO, Mesto> {

	
	@Autowired
	private MestoService mestoService;

	@Override
	public Mesto convert(MestoDTO dto) {
		Mesto mesto;
		if (dto.getId() != null) {
			mesto = mestoService.findOne(dto.getId());
		}else {
			mesto = new Mesto();
		}
		
		if (mesto != null) {
			mesto.setGrad(dto.getMestoOdrzavanja());
		}
		return mesto;
	};
	
	
}
