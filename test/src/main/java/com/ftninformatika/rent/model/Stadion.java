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
import javax.persistence.OneToOne;





@Entity
public class Stadion {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private String naziv;
	
	@Column
	private int kapacitet;
	
	@Column
	private String drzava;
	
	@Column
	private String grad;
	
	@OneToOne(mappedBy = "stadion")
	private Klub klub;

	public Stadion() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Stadion(Long id, String naziv, int kapacitet, String drzava, String grad, Klub klub) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.kapacitet = kapacitet;
		this.drzava = drzava;
		this.grad = grad;
		this.klub = klub;
	}



	public Stadion(Long id, String naziv, int kapacitet) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.kapacitet = kapacitet;
	}

	

	



	@Override
	public int hashCode() {
		return Objects.hash(drzava, grad, id, kapacitet, klub, naziv);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stadion other = (Stadion) obj;
		return Objects.equals(drzava, other.drzava) && Objects.equals(grad, other.grad) && Objects.equals(id, other.id)
				&& kapacitet == other.kapacitet && Objects.equals(klub, other.klub)
				&& Objects.equals(naziv, other.naziv);
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

	public int getKapacitet() {
		return kapacitet;
	}

	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}

	

	



	public Klub getKlub() {
		return klub;
	}



	public void setKlub(Klub klub) {
		this.klub = klub;
	}



	public String getDrzava() {
		return drzava;
	}



	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}



	public String getGrad() {
		return grad;
	}



	public void setGrad(String grad) {
		this.grad = grad;
	}



	@Override
	public String toString() {
		return "Stadion [id=" + id + ", naziv=" + naziv + ", kapacitet=" + kapacitet + ", drzava=" + drzava + ", grad="
				+ grad + ", klub=" + klub + "]";
	}



	

	
	
	
}
