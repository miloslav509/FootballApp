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

import javax.persistence.OneToMany;

@Entity
public class Sudija {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private String ime;
	
	@Column
	private String prezime;
	
	@OneToMany(mappedBy = "sudija", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Utakmica> utakmice = new ArrayList<>();

	public Sudija() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sudija(Long id, String ime, String prezime) {
		super();
		this.id = id;
		
		this.ime = ime;
		this.prezime = prezime;
	}

	public Sudija(Long id, String ime, String prezime, List<Utakmica> utakmice) {
		super();
		this.id = id;
		
		this.ime = ime;
		this.prezime = prezime;
		this.utakmice = utakmice;
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

	public List<Utakmica> getUtakmice() {
		return utakmice;
	}

	public void setUtakmice(List<Utakmica> utakmice) {
		this.utakmice = utakmice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, ime, prezime, utakmice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sudija other = (Sudija) obj;
		return Objects.equals(id, other.id) && Objects.equals(ime, other.ime) && Objects.equals(prezime, other.prezime)
				&& Objects.equals(utakmice, other.utakmice);
	}

	@Override
	public String toString() {
		return "Sudija [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", utakmice=" + utakmice + "]";
	}
	
	
	
	
	
}
