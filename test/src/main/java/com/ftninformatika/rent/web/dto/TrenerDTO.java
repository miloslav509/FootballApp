package com.ftninformatika.rent.web.dto;

import javax.validation.constraints.Positive;

public class TrenerDTO {

	 @Positive(message = "Id mora biti pozitivan broj.")
	 private Long id;
	 
	 private String ime;
	 
	 private String prezime;
	 
	 private String klubNaziv;
	 
	 private Long klubId;

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

	public String getKlubNaziv() {
		return klubNaziv;
	}

	public void setKlubNaziv(String klubNaziv) {
		this.klubNaziv = klubNaziv;
	}

	public Long getKlubId() {
		return klubId;
	}

	public void setKlubId(Long klubId) {
		this.klubId = klubId;
	}
	 
	
}
