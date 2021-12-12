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
	
	
	@OneToOne
	private Takmicenje takmicenje;
	
	@Column
	private int bodovi;
	
	@Column
	private int pozicija;
	
	@Column
	private int pobede;
	
	@Column
	private int porazi;
	
	@Column
	private int nereseneUtakmice;
	
	@Column
	private boolean prolaz = false;
	
	@Column
	private boolean ispadanje = false;

	public Tabela() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	

	public Tabela(Long id, Klub klub, int bodovi, int pozicija, boolean prolaz, boolean ispadanje) {
		super();
		this.id = id;
		this.klub = klub;
		this.bodovi = bodovi;
		this.pozicija = pozicija;
		this.prolaz = prolaz;
		this.ispadanje = ispadanje;
	}
	
	

	




	public Tabela(Long id, Klub klub, Takmicenje takmicenje, int bodovi, int pozicija, int pobede, int porazi,
			int nereseneUtakmice, boolean prolaz, boolean ispadanje) {
		super();
		this.id = id;
		this.klub = klub;
		this.takmicenje = takmicenje;
		this.bodovi = bodovi;
		this.pozicija = pozicija;
		this.pobede = pobede;
		this.porazi = porazi;
		this.nereseneUtakmice = nereseneUtakmice;
		this.prolaz = prolaz;
		this.ispadanje = ispadanje;
	}





	



	@Override
	public int hashCode() {
		return Objects.hash(bodovi, id, ispadanje, klub, nereseneUtakmice, pobede, porazi, pozicija, prolaz,
				takmicenje);
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
		return bodovi == other.bodovi && Objects.equals(id, other.id) && ispadanje == other.ispadanje
				&& Objects.equals(klub, other.klub) && nereseneUtakmice == other.nereseneUtakmice
				&& pobede == other.pobede && porazi == other.porazi && pozicija == other.pozicija
				&& prolaz == other.prolaz && Objects.equals(takmicenje, other.takmicenje);
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

	public int getPozicija() {
		return pozicija;
	}

	public void setPozicija(int pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isProlaz() {
		return prolaz;
	}

	public void setProlaz(boolean prolaz) {
		this.prolaz = prolaz;
	}

	public boolean isIspadanje() {
		return ispadanje;
	}

	public void setIspadanje(boolean ispadanje) {
		this.ispadanje = ispadanje;
	}

	
	public Takmicenje getTakmicenje() {
		return takmicenje;
	}





	public void setTakmicenje(Takmicenje takmicenje) {
		this.takmicenje = takmicenje;
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





	@Override
	public String toString() {
		return "Tabela [id=" + id + ", klub=" + klub + ", takmicenje=" + takmicenje + ", bodovi=" + bodovi
				+ ", pozicija=" + pozicija + ", pobede=" + pobede + ", porazi=" + porazi + ", nereseneUtakmice="
				+ nereseneUtakmice + ", prolaz=" + prolaz + ", ispadanje=" + ispadanje + "]";
	}





	

	

	
	
	
}
