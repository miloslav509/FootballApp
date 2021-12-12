package com.ftninformatika.rent.model;

import java.util.ArrayList;
import java.util.List;

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
	private int godina;
	
	@ManyToOne
	private Tabela tabela;
	
	@OneToMany(mappedBy = "takmicenje", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Utakmica> utakmice = new ArrayList<>();

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
	
	

	public Takmicenje(Long id, String nazivTakmicenja, String organizator, int godina, Tabela tabela) {
		super();
		this.id = id;
		this.nazivTakmicenja = nazivTakmicenja;
		this.organizator = organizator;
		this.godina = godina;
		this.tabela = tabela;
	}
	
	

	public Takmicenje(Long id, String nazivTakmicenja, String organizator, int godina, Tabela tabela,
			List<Utakmica> utakmice) {
		super();
		this.id = id;
		this.nazivTakmicenja = nazivTakmicenja;
		this.organizator = organizator;
		this.godina = godina;
		this.tabela = tabela;
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

	public int getGodina() {
		return godina;
	}

	public void setGodina(int godina) {
		this.godina = godina;
	}

	public Tabela getTabela() {
		return tabela;
	}

	public void setTabela(Tabela tabela) {
		this.tabela = tabela;
	}
	
	

	public List<Utakmica> getUtakmice() {
		return utakmice;
	}

	public void setUtakmice(List<Utakmica> utakmice) {
		this.utakmice = utakmice;
	}

	@Override
	public String toString() {
		return "Takmicenje [id=" + id + ", nazivTakmicenja=" + nazivTakmicenja + ", organizator=" + organizator
				+ ", godina=" + godina + ", tabela=" + tabela + ", utakmice=" + utakmice + "]";
	}



	
	
}
