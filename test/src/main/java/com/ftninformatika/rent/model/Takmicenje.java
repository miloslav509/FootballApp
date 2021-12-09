package com.ftninformatika.rent.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private int godina;

	public Takmicenje() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Takmicenje(Long id, String nazivTakmicenja, String organizator, int godina) {
		super();
		this.id = id;
		this.nazivTakmicenja = nazivTakmicenja;
		this.organizator = organizator;
		this.godina = godina;
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

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;
	}
	
	
}
