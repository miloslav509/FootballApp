package com.ftninformatika.rent.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Trener {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private String ime;
	
	@Column
	private String prezime;
	
	@OneToOne
	private Klub klub;

	public Trener() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trener(Long id, String ime, String prezime) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
	}
	

	public Trener(Long id, String ime, String prezime, Klub klub) {
		super();
		this.id = id;
		
		this.ime = ime;
		this.prezime = prezime;
		this.klub = klub;
	}

	
	
	public Klub getKlub() {
		return klub;
	}

	public void setKlub(Klub klub) {
		this.klub = klub;
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

	@Override
	public int hashCode() {
		return Objects.hash(id, ime, klub, prezime);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trener other = (Trener) obj;
		return Objects.equals(id, other.id) && Objects.equals(ime, other.ime) && Objects.equals(klub, other.klub)
				&& Objects.equals(prezime, other.prezime);
	}

	@Override
	public String toString() {
		return "Trener [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", klub=" + klub + "]";
	}

	
	
	
	
}
