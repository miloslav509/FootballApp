package com.ftninformatika.rent.web.dto;

import javax.validation.constraints.Positive;

public class MestoDTO {

	
	@Positive(message = "Id mora biti pozitivan broj.")
    private Long id;
	
	private String mestoOdrzavanja;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMestoOdrzavanja() {
		return mestoOdrzavanja;
	}

	public void setMestoOdrzavanja(String mestoOdrzavanja) {
		this.mestoOdrzavanja = mestoOdrzavanja;
	}
	
	
}
