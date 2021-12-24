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
public class Klub {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private String naziv;
	
	@OneToOne
	private Stadion stadion;
	
	@OneToMany(mappedBy = "klub", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Igrac> igraci = new ArrayList<>();
	
	@OneToMany(mappedBy = "klubDomacin", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Utakmica> utakmiceDomacin = new ArrayList<>();
	
	@OneToMany(mappedBy = "klubGost", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Utakmica> utakmiceGost = new ArrayList<>();
	
	@OneToOne
	private Trener trener;
	
	@OneToOne(mappedBy = "klub")
	private Tabela tabela;
	
	@Column
	private String slika;
	
	

	public Klub() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Klub(Long id, String naziv, Stadion stadion, List<Igrac> igraci, List<Utakmica> utakmiceDomacin,
			List<Utakmica> utakmiceGost, Trener trener) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.stadion = stadion;
		this.igraci = igraci;
		this.utakmiceDomacin = utakmiceDomacin;
		this.utakmiceGost = utakmiceGost;
		this.trener = trener;
	}



	public Klub(Long id, String naziv, Stadion stadion) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.stadion = stadion;
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

	public Stadion getStadion() {
		return stadion;
	}

	public void setStadion(Stadion stadion) {
		this.stadion = stadion;
	}

	public List<Igrac> getIgraci() {
		return igraci;
	}

	public void setIgraci(List<Igrac> igraci) {
		this.igraci = igraci;
	}

	

	public Trener getTrener() {
		return trener;
	}

	public void setTrener(Trener trener) {
		this.trener = trener;
	}


	public List<Utakmica> getUtakmiceDomacin() {
		return utakmiceDomacin;
	}



	public void setUtakmiceDomacin(List<Utakmica> utakmiceDomacin) {
		this.utakmiceDomacin = utakmiceDomacin;
	}



	public List<Utakmica> getUtakmiceGost() {
		return utakmiceGost;
	}



	public void setUtakmiceGost(List<Utakmica> utakmiceGost) {
		this.utakmiceGost = utakmiceGost;
	}

	


	public Tabela getTabela() {
		return tabela;
	}



	public void setTabela(Tabela tabela) {
		this.tabela = tabela;
	}



	public String getSlika() {
		return slika;
	}



	public void setSlika(String slika) {
		this.slika = slika;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(id, igraci, naziv, slika, stadion, tabela, trener, utakmiceDomacin, utakmiceGost);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Klub other = (Klub) obj;
		return Objects.equals(id, other.id) && Objects.equals(igraci, other.igraci)
				&& Objects.equals(naziv, other.naziv) && Objects.equals(slika, other.slika)
				&& Objects.equals(stadion, other.stadion) && Objects.equals(tabela, other.tabela)
				&& Objects.equals(trener, other.trener) && Objects.equals(utakmiceDomacin, other.utakmiceDomacin)
				&& Objects.equals(utakmiceGost, other.utakmiceGost);
	}



	@Override
	public String toString() {
		return "Klub [id=" + id + ", naziv=" + naziv + ", stadion=" + stadion + ", igraci=" + igraci
				+ ", utakmiceDomacin=" + utakmiceDomacin + ", utakmiceGost=" + utakmiceGost + ", trener=" + trener
				+ "]";
	}

	

	
	
	
}
