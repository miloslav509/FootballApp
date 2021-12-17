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
public class Takmicenje {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private String nazivTakmicenja;
	
	@Column
	private String organizator;
	
	@Column
	private String godina;
	
	
	@OneToMany(mappedBy = "takmicenje", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Utakmica> utakmice = new ArrayList<>();

	public Takmicenje() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Takmicenje(Long id, String nazivTakmicenja, String organizator, String godina) {
		super();
		this.id = id;
		this.nazivTakmicenja = nazivTakmicenja;
		this.organizator = organizator;
		this.godina = godina;
	}
	

	
	

	public Takmicenje(Long id, String nazivTakmicenja, String organizator, String godina,
			List<Utakmica> utakmice) {
		super();
		this.id = id;
		this.nazivTakmicenja = nazivTakmicenja;
		this.organizator = organizator;
		this.godina = godina;
		this.utakmice = utakmice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNazivTakmicenja() {
		return nazivTakmicenja;
	}

	public void setNazivTakmicenja(String nazivTakmicenja) {
		this.nazivTakmicenja = nazivTakmicenja;
	}

	public String getOrganizator() {
		return organizator;
	}

	public void setOrganizator(String organizator) {
		this.organizator = organizator;
	}

	

	public String getGodina() {
		return godina;
	}

	public void setGodina(String godina) {
		this.godina = godina;
	}

	
	

	public List<Utakmica> getUtakmice() {
		return utakmice;
	}

	public void setUtakmice(List<Utakmica> utakmice) {
		this.utakmice = utakmice;
	}
	
	

	

	@Override
	public int hashCode() {
		return Objects.hash(godina, id, nazivTakmicenja, organizator, utakmice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Takmicenje other = (Takmicenje) obj;
		return Objects.equals(godina, other.godina) && Objects.equals(id, other.id)
				&& Objects.equals(nazivTakmicenja, other.nazivTakmicenja)
				&& Objects.equals(organizator, other.organizator) && Objects.equals(utakmice, other.utakmice);
	}

	@Override
	public String toString() {
		return "Takmicenje [id=" + id + ", nazivTakmicenja=" + nazivTakmicenja + ", organizator=" + organizator
				+ ", godina=" + godina +  ", utakmice=" + utakmice + "]";
	}



	
	
}
