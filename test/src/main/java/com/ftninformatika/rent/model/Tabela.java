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
import javax.persistence.OneToOne;

@Entity
public class Tabela {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@OneToOne
	private Klub klub;
	
	@Column
	private int bodovi;
	
	@Column
	private int postignutiGolovi;
	
	@Column
	private int primljeniGolovi;
	
	@Column
	private int pobede;
	
	@Column
	private int porazi;
	
	@Column
	private int nereseneUtakmice;
	

	public Tabela() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Klub getKlub() {
		return klub;
	}

	public void setKlub(Klub klub) {
		this.klub = klub;
	}

	

	public int getBodovi() {
		return bodovi;
	}

	public void setBodovi(int bodovi) {
		this.bodovi = bodovi;
	}

	

	




	public int getPobede() {
		return pobede;
	}





	public void setPobede(int pobede) {
		this.pobede = pobede;
	}





	public int getPorazi() {
		return porazi;
	}





	public void setPorazi(int porazi) {
		this.porazi = porazi;
	}





	public int getNereseneUtakmice() {
		return nereseneUtakmice;
	}





	public void setNereseneUtakmice(int nereseneUtakmice) {
		this.nereseneUtakmice = nereseneUtakmice;
	}


	public int getPostignutiGolovi() {
		return postignutiGolovi;
	}


	public void setPostignutiGolovi(int postignutiGolovi) {
		this.postignutiGolovi = postignutiGolovi;
	}


	public int getPrimljeniGolovi() {
		return primljeniGolovi;
	}


	public void setPrimljeniGolovi(int primljeniGolovi) {
		this.primljeniGolovi = primljeniGolovi;
	}


	@Override
	public int hashCode() {
		return Objects.hash(bodovi, id, klub, nereseneUtakmice, pobede, porazi, postignutiGolovi, primljeniGolovi);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tabela other = (Tabela) obj;
		return bodovi == other.bodovi && Objects.equals(id, other.id) && Objects.equals(klub, other.klub)
				&& nereseneUtakmice == other.nereseneUtakmice && pobede == other.pobede && porazi == other.porazi
				&& postignutiGolovi == other.postignutiGolovi && primljeniGolovi == other.primljeniGolovi;
	}


	@Override
	public String toString() {
		return "Tabela [id=" + id + ", klub=" + klub + ", bodovi=" + bodovi + ", postignutiGolovi=" + postignutiGolovi
				+ ", primljeniGolovi=" + primljeniGolovi + ", pobede=" + pobede + ", porazi=" + porazi
				+ ", nereseneUtakmice=" + nereseneUtakmice + "]";
	}








	

	

	
	
	
}
