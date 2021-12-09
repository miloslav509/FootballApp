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
import javax.persistence.OneToMany;

@Entity
public class Drzava {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private int pozivniBroj;
	
	@Column
	private String naziv;
	
	@OneToMany(mappedBy = "drzava", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Grad> gradovi = new ArrayList<>();

	public Drzava() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Drzava(Long id, int pozivniBroj, String naziv) {
		super();
		this.id = id;
		this.pozivniBroj = pozivniBroj;
		this.naziv = naziv;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPozivniBroj() {
		return pozivniBroj;
	}

	public void setPozivniBroj(int pozivniBroj) {
		this.pozivniBroj = pozivniBroj;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public List<Grad> getGradovi() {
		return gradovi;
	}

	public void setGradovi(List<Grad> gradovi) {
		this.gradovi = gradovi;
	}

	@Override
	public String toString() {
		return "Drzava [id=" + id + ", pozivniBroj=" + pozivniBroj + ", naziv=" + naziv + ", gradovi=" + gradovi + "]";
	}
	
	
	
}
