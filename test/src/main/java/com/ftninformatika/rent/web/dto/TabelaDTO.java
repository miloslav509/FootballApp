package com.ftninformatika.rent.web.dto;

import javax.validation.constraints.Positive;

public class TabelaDTO {

	 @Positive(message = "Id mora biti pozitivan broj.")
	 private Long id;
	 
	 private String klubNaziv;
	 
	 private Long klubId;
	 
	 private String takmicenjeNaziv;
	 
	 private int bodovi;
	 
	 private int pobede;
	 
	 private int porazi;
	 
	 private int nereseneUtakmice;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getTakmicenjeNaziv() {
		return takmicenjeNaziv;
	}

	public void setTakmicenjeNaziv(String takmicenjeNaziv) {
		this.takmicenjeNaziv = takmicenjeNaziv;
	}

	public int getBodovi() {
		return bodovi;
	}

	public void setBodovi(int bodovi) {
		this.bodovi = bodovi;
	}

	public int getPobede() {
		return pobede;
	}

	public void setPobede(int pobede) {
		this.pobede = pobede;
	}

	public int getPorazi() {
		return porazi;
	}

	public void setPorazi(int porazi) {
		this.porazi = porazi;
	}

	public int getNereseneUtakmice() {
		return nereseneUtakmice;
	}

	public void setNereseneUtakmice(int nereseneUtakmice) {
		this.nereseneUtakmice = nereseneUtakmice;
	}
	 
	 
}
