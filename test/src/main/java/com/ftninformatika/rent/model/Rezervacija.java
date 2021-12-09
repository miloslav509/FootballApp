package com.ftninformatika.rent.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Rezervacija {
  
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private int brojKarata;
	
	@Column
	private double ukupnaCena;
	
	@ManyToOne
	private Festival festival;

	public Rezervacija() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rezervacija(int brojKarata, double ukupnaCena, Festival festival) {
		super();
		this.brojKarata = brojKarata;
		this.ukupnaCena = ukupnaCena;
		this.festival = festival;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getBrojKarata() {
		return brojKarata;
	}

	public void setBrojKarata(int brojKarata) {
		this.brojKarata = brojKarata;
	}

	public double getUkupnaCena() {
		return ukupnaCena;
	}

	public void setUkupnaCena(double ukupnaCena) {
		this.ukupnaCena = ukupnaCena;
	}

	public Festival getFestival() {
		return festival;
	}

	public void setFestival(Festival festival) {
		this.festival = festival;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + brojKarata;
		result = prime * result + ((festival == null) ? 0 : festival.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		long temp;
		temp = Double.doubleToLongBits(ukupnaCena);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rezervacija other = (Rezervacija) obj;
		if (brojKarata != other.brojKarata)
			return false;
		if (festival == null) {
			if (other.festival != null)
				return false;
		} else if (!festival.equals(other.festival))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Double.doubleToLongBits(ukupnaCena) != Double.doubleToLongBits(other.ukupnaCena))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Rezervacija [id=" + id + ", brojKarata=" + brojKarata + ", ukupnaCena=" + ukupnaCena + ", festival="
				+ festival + "]";
	}
	
	
}
