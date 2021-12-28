package com.ftninformatika.rent.web.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Positive;

public class UtakmicaDTO {

	@Positive(message = "Id mora biti pozitivan broj.")
	private Long id;
	 
	private String datumVreme;
	 
	private String domacinNaziv;
	 
	private Long domacinId;
	 
	private String gostNaziv;
	 
	private Long gostId;
	 
	private int suteviDomacin;
	 
	private int suteviGost;
	 
	private int suteviUGolDomacin;
	 
	private int suteviUGolGost;
	 
	private int posedGost;
	 
	private int posedDomacin;
	 
	private String stadionNaziv;
	 
	private Long stadionId;
	 
	private int goloviDomacin;
	 
	private int goloviGost;
	 
	private List<GolDTO> golovi = new ArrayList<>();
	 
	private int kolo;
	 
	private String sudijaIme;
	 
	private Long sudijaId;
	 
	private String takmicenjeNaziv;
	 
	private Long takmicenjeId;
	 
	private boolean odigrana;

	private String video;
	
	private List<KomentarDTO> komentari;
	
	private String domacinSlika;
	
	private String gostSlika;
	 
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDatumVreme() {
		return datumVreme;
	}

	public void setDatumVreme(String datumVreme) {
		this.datumVreme = datumVreme;
	}

	public String getDomacinNaziv() {
		return domacinNaziv;
	}

	public void setDomacinNaziv(String domacinNaziv) {
		this.domacinNaziv = domacinNaziv;
	}

	public Long getDomacinId() {
		return domacinId;
	}

	public void setDomacinId(Long domacinId) {
		this.domacinId = domacinId;
	}

	public String getGostNaziv() {
		return gostNaziv;
	}

	public void setGostNaziv(String gostNaziv) {
		this.gostNaziv = gostNaziv;
	}

	public Long getGostId() {
		return gostId;
	}

	public void setGostId(Long gostId) {
		this.gostId = gostId;
	}

	public int getSuteviDomacin() {
		return suteviDomacin;
	}

	public void setSuteviDomacin(int suteviDomacin) {
		this.suteviDomacin = suteviDomacin;
	}

	public int getSuteviGost() {
		return suteviGost;
	}

	public void setSuteviGost(int suteviGost) {
		this.suteviGost = suteviGost;
	}

	public int getSuteviUGolDomacin() {
		return suteviUGolDomacin;
	}

	public void setSuteviUGolDomacin(int suteviUGolDomacin) {
		this.suteviUGolDomacin = suteviUGolDomacin;
	}

	public int getSuteviUGolGost() {
		return suteviUGolGost;
	}

	public void setSuteviUGolGost(int suteviUGolGost) {
		this.suteviUGolGost = suteviUGolGost;
	}

	public int getPosedGost() {
		return posedGost;
	}

	public void setPosedGost(int posedGost) {
		this.posedGost = posedGost;
	}

	public int getPosedDomacin() {
		return posedDomacin;
	}

	public void setPosedDomacin(int posedDomacin) {
		this.posedDomacin = posedDomacin;
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

	public int getGoloviDomacin() {
		return goloviDomacin;
	}

	public void setGoloviDomacin(int goloviDomacin) {
		this.goloviDomacin = goloviDomacin;
	}

	public int getGoloviGost() {
		return goloviGost;
	}

	public void setGoloviGost(int goloviGost) {
		this.goloviGost = goloviGost;
	}

	public List<GolDTO> getGolovi() {
		return golovi;
	}

	public void setGolovi(List<GolDTO> golovi) {
		this.golovi = golovi;
	}

	public int getKolo() {
		return kolo;
	}

	public void setKolo(int kolo) {
		this.kolo = kolo;
	}

	public String getSudijaIme() {
		return sudijaIme;
	}

	public void setSudijaIme(String sudijaIme) {
		this.sudijaIme = sudijaIme;
	}

	public Long getSudijaId() {
		return sudijaId;
	}

	public void setSudijaId(Long sudijaId) {
		this.sudijaId = sudijaId;
	}

	public String getTakmicenjeNaziv() {
		return takmicenjeNaziv;
	}

	public void setTakmicenjeNaziv(String takmicenjeNaziv) {
		this.takmicenjeNaziv = takmicenjeNaziv;
	}

	public Long getTakmicenjeId() {
		return takmicenjeId;
	}

	public void setTakmicenjeId(Long takmicenjeId) {
		this.takmicenjeId = takmicenjeId;
	}

	public boolean isOdigrana() {
		return odigrana;
	}

	public void setOdigrana(boolean odigrana) {
		this.odigrana = odigrana;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public List<KomentarDTO> getKomentari() {
		return komentari;
	}

	public void setKomentari(List<KomentarDTO> komentari) {
		this.komentari = komentari;
	}

	public String getDomacinSlika() {
		return domacinSlika;
	}

	public void setDomacinSlika(String domacinSlika) {
		this.domacinSlika = domacinSlika;
	}

	public String getGostSlika() {
		return gostSlika;
	}

	public void setGostSlika(String gostSlika) {
		this.gostSlika = gostSlika;
	}
	 
	
	 
}
