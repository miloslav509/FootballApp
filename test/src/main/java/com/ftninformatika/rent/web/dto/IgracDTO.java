package com.ftninformatika.rent.web.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Positive;

public class IgracDTO {

	 @Positive(message = "Id mora biti pozitivan broj.")
	 private Long id;
	 
	 private String ime;
	 
	 private String prezime;
	 
	 private String pozicija;
	 
	 private String klubNaziv;
	 
	 private Long klubId;
	 
	 private List<GolDTO> sistencije = new ArrayList<>();
	 
	 private List<GolDTO> golovi = new ArrayList<>();

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

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
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

	public List<GolDTO> getSistencije() {
		return sistencije;
	}

	public void setSistencije(List<GolDTO> sistencije) {
		this.sistencije = sistencije;
	}

	public List<GolDTO> getGolovi() {
		return golovi;
	}

	public void setGolovi(List<GolDTO> golovi) {
		this.golovi = golovi;
	}
	 
	 
}
