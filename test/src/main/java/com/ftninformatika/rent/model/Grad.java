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
public class Grad {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private int ptt;
	
	@Column
	private String naziv;
	
	@OneToMany(mappedBy = "grad", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Stadion> stadioni = new ArrayList<>();
	
	@ManyToOne
	private Drzava drzava;

	public Grad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Grad(Long id, int ptt, String naziv) {
		super();
		this.id = id;
		this.ptt = ptt;
		this.naziv = naziv;
	}
	
	

	

	public Grad(Long id, int ptt, String naziv, List<Stadion> stadioni, Drzava drzava) {
		super();
		this.id = id;
		this.ptt = ptt;
		this.naziv = naziv;
		this.stadioni = stadioni;
		this.drzava = drzava;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPtt() {
		return ptt;
	}

	public void setPtt(int ptt) {
		this.ptt = ptt;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	

	public Drzava getDrzava() {
		return drzava;
	}

	public void setDrzava(Drzava drzava) {
		this.drzava = drzava;
	}

	@Override
	public int hashCode() {
		return Objects.hash(drzava, id, naziv, ptt, stadioni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grad other = (Grad) obj;
		return Objects.equals(drzava, other.drzava) && Objects.equals(id, other.id)
				&& Objects.equals(naziv, other.naziv) && ptt == other.ptt && Objects.equals(stadioni, other.stadioni);
	}

	public List<Stadion> getStadioni() {
		return stadioni;
	}

	public void setStadioni(List<Stadion> stadioni) {
		this.stadioni = stadioni;
	}

	@Override
	public String toString() {
		return "Grad [id=" + id + ", ptt=" + ptt + ", naziv=" + naziv + ", stadioni=" + stadioni + ", drzava=" + drzava
				+ "]";
	}

	
	
	
}
