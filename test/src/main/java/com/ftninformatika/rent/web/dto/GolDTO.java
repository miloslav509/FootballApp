package com.ftninformatika.rent.web.dto;

import javax.validation.constraints.Positive;

public class GolDTO {

	
	 @Positive(message = "Id mora biti pozitivan broj.")
	 private Long id;
	 
	 private int minut;
	 
	 private String utakmicaNaziv;
	 
	 private Long utakmicaId;
	 
	 private String strelacIme;
	 
	 private Long strelacId;
	 
	 private String asistentIme;
	 
	 private String asistentPrezime;
	 
	 private String strelacPrezime;
	 
	 private Long asistentId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getMinut() {
		return minut;
	}

	public void setMinut(int minut) {
		this.minut = minut;
	}

	public String getUtakmicaNaziv() {
		return utakmicaNaziv;
	}

	public void setUtakmicaNaziv(String utakmicaNaziv) {
		this.utakmicaNaziv = utakmicaNaziv;
	}

	public Long getUtakmicaId() {
		return utakmicaId;
	}

	public void setUtakmicaId(Long utakmicaId) {
		this.utakmicaId = utakmicaId;
	}

	public String getStrelacIme() {
		return strelacIme;
	}

	public void setStrelacIme(String strelacIme) {
		this.strelacIme = strelacIme;
	}

	public Long getStrelacId() {
		return strelacId;
	}

	public void setStrelacId(Long strelacId) {
		this.strelacId = strelacId;
	}

	public String getAsistentIme() {
		return asistentIme;
	}

	public void setAsistentIme(String asistentIme) {
		this.asistentIme = asistentIme;
	}

	public Long getAsistentId() {
		return asistentId;
	}

	public void setAsistentId(Long asistentId) {
		this.asistentId = asistentId;
	}

	public String getAsistentPrezime() {
		return asistentPrezime;
	}

	public void setAsistentPrezime(String asistentPrezime) {
		this.asistentPrezime = asistentPrezime;
	}

	public String getStrelacPrezime() {
		return strelacPrezime;
	}

	public void setStrelacPrezime(String strelacPrezime) {
		this.strelacPrezime = strelacPrezime;
	}
	 
	
	 
}
