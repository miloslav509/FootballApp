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
	
	@OneToMany(mappedBy = "stadion", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Klub> klubovi = new ArrayList<>();

	public Stadion() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Stadion(Long id, String naziv, int kapacitet, String drzava, String grad, List<Klub> klubovi) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.kapacitet = kapacitet;
		this.drzava = drzava;
		this.grad = grad;
		this.klubovi = klubovi;
	}



	public Stadion(Long id, String naziv, int kapacitet) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.kapacitet = kapacitet;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(drzava, grad, id, kapacitet, klubovi, naziv);
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
				&& kapacitet == other.kapacitet && Objects.equals(klubovi, other.klubovi)
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

	

	public List<Klub> getKlubovi() {
		return klubovi;
	}

	public void setKlubovi(List<Klub> klubovi) {
		this.klubovi = klubovi;
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
				+ grad + ", klubovi=" + klubovi + "]";
	}

	
	
	
}
