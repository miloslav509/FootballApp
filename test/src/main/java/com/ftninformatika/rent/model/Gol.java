package com.ftninformatika.rent.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Gol {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column
	private int minut;
	
	@ManyToOne
	private Utakmica utakmica;
	
	@ManyToOne
	private Igrac strelacGola;
	
	@ManyToOne
	private Igrac asistent;

	public Gol() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gol(Long id, int minut, Utakmica utakmica) {
		super();
		this.id = id;
		this.minut = minut;
		this.utakmica = utakmica;
	}

	public Gol(Long id, int minut, Utakmica utakmica, Igrac strelacGola, Igrac asistent) {
		super();
		this.id = id;
		this.minut = minut;
		this.utakmica = utakmica;
		this.strelacGola = strelacGola;
		this.asistent = asistent;
	}

	@Override
	public int hashCode() {
		return Objects.hash(asistent, id, minut, strelacGola, utakmica);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gol other = (Gol) obj;
		return Objects.equals(asistent, other.asistent) && Objects.equals(id, other.id) && minut == other.minut
				&& Objects.equals(strelacGola, other.strelacGola) && Objects.equals(utakmica, other.utakmica);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getMinut() {
		return minut;
	}

	public void setMinut(int minut) {
		this.minut = minut;
	}

	public Utakmica getUtakmica() {
		return utakmica;
	}

	public void setUtakmica(Utakmica utakmica) {
		this.utakmica = utakmica;
	}

	public Igrac getStrelacGola() {
		return strelacGola;
	}

	public void setStrelacGola(Igrac strelac) {
		this.strelacGola = strelac;
	}

	public Igrac getAsistent() {
		return asistent;
	}

	public void setAsistent(Igrac asistent) {
		this.asistent = asistent;
	}

	@Override
	public String toString() {
		return "Gol [id=" + id + ", minut=" + minut + ", utakmica=" + utakmica + ", strelac=" + strelacGola + ", asistent="
				+ asistent + "]";
	}
	
	
}
