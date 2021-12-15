package com.ftninformatika.rent.web.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Positive;

public class KlubDTO {

	 @Positive(message = "Id mora biti pozitivan broj.")
	 private Long id;
	 
	 private String naziv;
	 
	 private String stadionNaziv;
	 
	 private Long stadionId;
	 
	 private List<IgracDTO> igraci = new ArrayList<>();
	 
	 private String trenerImePrezime;
	 
	 private Long trenerId;
	 
	 private Long tabelaId;
	 
	 private List<UtakmicaDTO> utakmiceGost = new ArrayList<>();
	 
	 private List<UtakmicaDTO> utakmiceDomacin = new ArrayList<>();

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

	public String getStadionNaziv() {
		return stadionNaziv;
	}

	public void setStadionNaziv(String stadionNaziv) {
		this.stadionNaziv = stadionNaziv;
	}

	public Long getStadionId() {
		return stadionId;
	}

	public void setStadionId(Long stadionId) {
		this.stadionId = stadionId;
	}

	public List<IgracDTO> getIgraci() {
		return igraci;
	}

	public void setIgraci(List<IgracDTO> igraci) {
		this.igraci = igraci;
	}

	public String getTrenerImePrezime() {
		return trenerImePrezime;
	}

	public void setTrenerImePrezime(String trenerImePrezime) {
		this.trenerImePrezime = trenerImePrezime;
	}

	public Long getTrenerId() {
		return trenerId;
	}

	public void setTrenerId(Long trenerId) {
		this.trenerId = trenerId;
	}

	public Long getTabelaId() {
		return tabelaId;
	}

	public void setTabelaId(Long tabelaId) {
		this.tabelaId = tabelaId;
	}

	public List<UtakmicaDTO> getUtakmiceGost() {
		return utakmiceGost;
	}

	public void setUtakmiceGost(List<UtakmicaDTO> utakmiceGost) {
		this.utakmiceGost = utakmiceGost;
	}

	public List<UtakmicaDTO> getUtakmiceDomacin() {
		return utakmiceDomacin;
	}

	public void setUtakmiceDomacin(List<UtakmicaDTO> utakmiceDomacin) {
		this.utakmiceDomacin = utakmiceDomacin;
	}
	 
	 
}
