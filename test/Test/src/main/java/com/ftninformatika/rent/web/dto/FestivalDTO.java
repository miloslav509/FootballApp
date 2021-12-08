package com.ftninformatika.rent.web.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class FestivalDTO {

	@Positive(message = "Id mora biti pozitivan broj.")
    private Long id;
	
	
	@NotBlank
	@Size(max = 50)
	private String naziv;
	
	private String mestoNaziv;
	
	private Long mestoId;
	
	private String datumPocetka;
	
	private String datumZavrsetka;
	@Positive
	private double cenaKarte;
	
	private int brojKarata;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getMestoNaziv() {
		return mestoNaziv;
	}

	public void setMestoNaziv(String mestoNaziv) {
		this.mestoNaziv = mestoNaziv;
	}

	public Long getMestoId() {
		return mestoId;
	}

	public void setMestoId(Long mestoId) {
		this.mestoId = mestoId;
	}

	public String getDatumPocetka() {
		return datumPocetka;
	}

	public void setDatumPocetka(String datumPocetka) {
		this.datumPocetka = datumPocetka;
	}

	public String getDatumZavrsetka() {
		return datumZavrsetka;
	}

	public void setDatumZavrsetka(String datumZavrsetka) {
		this.datumZavrsetka = datumZavrsetka;
	}

	public double getCenaKarte() {
		return cenaKarte;
	}

	public void setCenaKarte(double cenaKarte) {
		this.cenaKarte = cenaKarte;
	}

	public int getBrojKarata() {
		return brojKarata;
	}

	public void setBrojKarata(int brojKarata) {
		this.brojKarata = brojKarata;
	}
	
	
}
