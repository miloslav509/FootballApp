package com.ftninformatika.rent.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Igrac {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private String ime;
	
	@Column
	private String prezime;
	
	@Column
	private String pozicija;
	
	@Column
	private int broj;
	
	@ManyToOne
	private Klub klub;
	
	@OneToMany(mappedBy = "strelacGola", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Gol> golovi = new ArrayList<>();
	
	@OneToMany(mappedBy = "asistent", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Gol> asistencije = new ArrayList<>();

	public Igrac() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Igrac(Long id, String ime, String prezime, String pozicija) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.pozicija = pozicija;
	}

	public Igrac(Long id, String ime, String prezime, String pozicija, Klub klub, List<Gol> golovi,
			List<Gol> asistencije) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.pozicija = pozicija;
		this.klub = klub;
		this.golovi = golovi;
		this.asistencije = asistencije;
	}
	
	

	public Igrac(String ime, String prezime, String pozicija, int broj, Klub klub, List<Gol> golovi,
			List<Gol> asistencije) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.pozicija = pozicija;
		this.broj = broj;
		this.klub = klub;
		this.golovi = golovi;
		this.asistencije = asistencije;
	}

	public Igrac(Long id, String ime, String prezime, String pozicija, int broj, Klub klub, List<Gol> golovi,
			List<Gol> asistencije) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.pozicija = pozicija;
		this.broj = broj;
		this.klub = klub;
		this.golovi = golovi;
		this.asistencije = asistencije;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(asistencije, broj, golovi, id, ime, klub, pozicija, prezime);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Igrac other = (Igrac) obj;
		return Objects.equals(asistencije, other.asistencije) && broj == other.broj
				&& Objects.equals(golovi, other.golovi) && Objects.equals(id, other.id)
				&& Objects.equals(ime, other.ime) && Objects.equals(klub, other.klub)
				&& Objects.equals(pozicija, other.pozicija) && Objects.equals(prezime, other.prezime);
	}
	
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

	public Klub getKlub() {
		return klub;
	}

	public void setKlub(Klub klub) {
		this.klub = klub;
	}

	public List<Gol> getGolovi() {
		return golovi;
	}

	public void setGolovi(List<Gol> golovi) {
		this.golovi = golovi;
	}

	public List<Gol> getAsistencije() {
		return asistencije;
	}

	public void setAsistencije(List<Gol> asistencije) {
		this.asistencije = asistencije;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	@Override
	public String toString() {
		return "Igrac [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", pozicija=" + pozicija + ", broj=" + broj
				+ ", klub=" + klub + ", golovi=" + golovi + ", asistencije=" + asistencije + "]";
	}

	

	
	
	
	
}
