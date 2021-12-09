package com.ftninformatika.rent.web.dto;

import javax.validation.constraints.Positive;

public class RezervacijaDTO {

	
	@Positive(message = "Id mora biti pozitivan broj.")
    private Long id;
	
	private int brojKarata;
	@Positive
	private double ukupnaCena;
	
	private Long festivalId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getBrojKarata() {
		return brojKarata;
	}

	public void setBrojKarata(int brojKarata) {
		this.brojKarata = brojKarata;
	}

	public double getUkupnaCena() {
		return ukupnaCena;
	}

	public void setUkupnaCena(double ukupnaCena) {
		this.ukupnaCena = ukupnaCena;
	}

	public Long getFestivalId() {
		return festivalId;
	}

	public void setFestivalId(Long festivalId) {
		this.festivalId = festivalId;
	}
	
	
}
