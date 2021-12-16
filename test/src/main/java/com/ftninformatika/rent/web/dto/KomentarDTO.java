package com.ftninformatika.rent.web.dto;

import javax.validation.constraints.Positive;

public class KomentarDTO {

	@Positive(message = "Id mora biti pozitivan broj.")
    private Long id;
	
	private String sadrzaj;
	
	private String korisnikKorisnickoIme;
	
	private Long korisnikId;
	
	private String datumVreme;
	
	private Long utakmicaId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSadrzaj() {
		return sadrzaj;
	}

	public void setSadrzaj(String sadrzaj) {
		this.sadrzaj = sadrzaj;
	}

	public String getKorisnikKorisnickoIme() {
		return korisnikKorisnickoIme;
	}

	public void setKorisnikKorisnickoIme(String korisnikKorisnickoIme) {
		this.korisnikKorisnickoIme = korisnikKorisnickoIme;
	}

	public Long getKorisnikId() {
		return korisnikId;
	}

	public void setKorisnikId(Long korisnikId) {
		this.korisnikId = korisnikId;
	}

	public String getDatumVreme() {
		return datumVreme;
	}

	public void setDatumVreme(String datumVreme) {
		this.datumVreme = datumVreme;
	}

	public Long getUtakmicaId() {
		return utakmicaId;
	}

	public void setUtakmicaId(Long utakmicaId) {
		this.utakmicaId = utakmicaId;
	}
	
	
}
