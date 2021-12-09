package com.ftninformatika.rent.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tabela {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@ManyToOne
	private Klub klub;
	
	@ManyToOne
	private Utakmica utakmica;
	
	@Column
	private int bodovi;
	
	@Column
	private int pozicija;
	
	@Column
	private boolean prolaz = false;
	
	@Column
	private boolean ispadanje = false;

	public Tabela() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tabela(Long id, Klub klub, Utakmica utakmica, int bodovi) {
		super();
		this.id = id;
		this.klub = klub;
		this.utakmica = utakmica;
		this.bodovi = bodovi;
	}

	public Tabela(Long id, Klub klub, Utakmica utakmica, int bodovi, int pozicija, boolean prolaz, boolean ispadanje) {
		super();
		this.id = id;
		this.klub = klub;
		this.utakmica = utakmica;
		this.bodovi = bodovi;
		this.pozicija = pozicija;
		this.prolaz = prolaz;
		this.ispadanje = ispadanje;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bodovi, id, ispadanje, klub, pozicija, prolaz, utakmica);
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
				&& Objects.equals(klub, other.klub) && pozicija == other.pozicija && prolaz == other.prolaz
				&& Objects.equals(utakmica, other.utakmica);
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

	public Utakmica getUtakmica() {
		return utakmica;
	}

	public void setUtakmica(Utakmica utakmica) {
		this.utakmica = utakmica;
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

	@Override
	public String toString() {
		return "Tabela [id=" + id + ", klub=" + klub + ", utakmica=" + utakmica + ", bodovi=" + bodovi + ", pozicija="
				+ pozicija + ", prolaz=" + prolaz + ", ispadanje=" + ispadanje + "]";
	}
	
	
}
