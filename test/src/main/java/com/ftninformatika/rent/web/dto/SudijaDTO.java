package com.ftninformatika.rent.web.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Positive;

public class SudijaDTO {

	 @Positive(message = "Id mora biti pozitivan broj.")
	 private Long id;
	 
	 private String ime;
	 
	 private String prezime;
	 
	 private List<UtakmicaDTO> utakmice = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public List<UtakmicaDTO> getUtakmice() {
		return utakmice;
	}

	public void setUtakmice(List<UtakmicaDTO> utakmice) {
		this.utakmice = utakmice;
	}
	 
	 
}
