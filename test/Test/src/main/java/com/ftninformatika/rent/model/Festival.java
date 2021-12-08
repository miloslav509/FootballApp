package com.ftninformatika.rent.model;

import java.util.ArrayList;
import java.util.List;

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
public class Festival {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private String naziv;
	
	@Column(nullable = false)
	private String datumPocetka;
	
	@Column(nullable = false)
	private String datumZavrsetka;
	
	@Column
	private double cena;
	
	@Column
	private int brojKarata;
	
	@ManyToOne
	private Mesto mesto;
	
	@OneToMany(mappedBy = "festival", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Rezervacija> rezervacije = new ArrayList<>();

	public Festival() {
		super();
	}

	public Festival(String naziv, String datumPocetka, String datum, double cena, int brojKarata, Mesto mesto) {
		super();
		this.naziv = naziv;
		this.datumPocetka = datumPocetka;
		this.datumZavrsetka = datum;
		this.cena = cena;
		this.brojKarata = brojKarata;
		this.mesto = mesto;
	}
	
	

	public List<Rezervacija> getRezervacije() {
		return rezervacije;
	}

	public void setRezervacije(List<Rezervacija> rezervacije) {
		this.rezervacije = rezervacije;
	}

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

	public String getDatumPocetka() {
		return datumPocetka;
	}

	public void setDatumPocetka(String datumPocetka) {
		this.datumPocetka = datumPocetka;
	}

	public String getDatumZavrsetka() {
		return datumZavrsetka;
	}

	public void setDatumZavrsetka(String datum) {
		this.datumZavrsetka = datum;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public int getBrojKarata() {
		return brojKarata;
	}

	public void setBrojKarata(int brojKarata) {
		this.brojKarata = brojKarata;
	}

	public Mesto getMesto() {
		return mesto;
	}

	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + brojKarata;
		long temp;
		temp = Double.doubleToLongBits(cena);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((datumPocetka == null) ? 0 : datumPocetka.hashCode());
		result = prime * result + ((datumZavrsetka == null) ? 0 : datumZavrsetka.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mesto == null) ? 0 : mesto.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((rezervacije == null) ? 0 : rezervacije.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Festival other = (Festival) obj;
		if (brojKarata != other.brojKarata)
			return false;
		if (Double.doubleToLongBits(cena) != Double.doubleToLongBits(other.cena))
			return false;
		if (datumPocetka == null) {
			if (other.datumPocetka != null)
				return false;
		} else if (!datumPocetka.equals(other.datumPocetka))
			return false;
		if (datumZavrsetka == null) {
			if (other.datumZavrsetka != null)
				return false;
		} else if (!datumZavrsetka.equals(other.datumZavrsetka))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mesto == null) {
			if (other.mesto != null)
				return false;
		} else if (!mesto.equals(other.mesto))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (rezervacije == null) {
			if (other.rezervacije != null)
				return false;
		} else if (!rezervacije.equals(other.rezervacije))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Festival [id=" + id + ", naziv=" + naziv + ", datumPocetka=" + datumPocetka + ", datumZavrsetka="
				+ datumZavrsetka + ", cena=" + cena + ", brojKarata=" + brojKarata + ", mesto=" + mesto
				+ ", rezervacije=" + rezervacije + "]";
	}

	

	
	
	
	
}
