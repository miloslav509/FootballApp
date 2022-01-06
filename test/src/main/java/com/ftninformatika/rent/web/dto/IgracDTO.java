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
	 
	 private int broj;
	 
	 private int brojGolova;
	 
	 private int brojAsistencija;

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

	

	public int getBrojGolova() {
		return brojGolova;
	}

	public void setBrojGolova(int brojGolova) {
		this.brojGolova = brojGolova;
	}

	public int getBrojAsistencija() {
		return brojAsistencija;
	}

	public void setBrojAsistencija(int brojAsistencija) {
		this.brojAsistencija = brojAsistencija;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}
	 
	
	 
}
