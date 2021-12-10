package com.ftninformatika.rent.model;

import java.time.LocalDateTime;
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
public class Utakmica {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "datum_vreme", nullable = false)
	private LocalDateTime datumIVreme;
	
	@ManyToOne
	private Klub klubDomacin;
	
	@ManyToOne
	private Klub klubGost;
	
	@Column
	private int suteviDomacin;
	
	@Column
	private int suteviGost;
	
	@Column
	private int suteviUGolDomacin;
	
	@Column
	private int suteviUGolGost;
	
	@Column
	private int posedDomacin;
	
	@Column
	private int posedGost;
	
	@OneToMany(mappedBy = "utakmica", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Gol> golovi = new ArrayList<>();
	
	@ManyToOne
	private Stadion stadion;
	
	@Column
	private String rezultat;
	
	@ManyToOne
	private Takmicenje takmicenje;
	
	
	@ManyToOne 
	private Sudija sudija;

	public Utakmica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Utakmica(Long id, LocalDateTime datumIVreme) {
		super();
		this.id = id;
		this.datumIVreme = datumIVreme;
	}

	public Utakmica(Long id, LocalDateTime datumIVreme, Klub klubDomacin, Klub klubGost, int suteviDomacin,
			int suteviGost, int suteviUGolDomacin, int suteviUGolGost, int posedDomacin, int posedGost,
			List<Gol> golovi, Stadion stadion, String rezultat, Takmicenje takmicenje, Sudija sudija) {
		super();
		this.id = id;
		this.datumIVreme = datumIVreme;
		this.klubDomacin = klubDomacin;
		this.klubGost = klubGost;
		this.suteviDomacin = suteviDomacin;
		this.suteviGost = suteviGost;
		this.suteviUGolDomacin = suteviUGolDomacin;
		this.suteviUGolGost = suteviUGolGost;
		this.posedDomacin = posedDomacin;
		this.posedGost = posedGost;
		this.golovi = golovi;
		this.stadion = stadion;
		this.rezultat = rezultat;
		this.takmicenje = takmicenje;
		this.sudija = sudija;
	}

	@Override
	public int hashCode() {
		return Objects.hash(datumIVreme, golovi, id, klubDomacin, klubGost, posedDomacin, posedGost, rezultat, stadion,
				sudija, suteviDomacin, suteviGost, suteviUGolDomacin, suteviUGolGost, takmicenje);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utakmica other = (Utakmica) obj;
		return Objects.equals(datumIVreme, other.datumIVreme) && Objects.equals(golovi, other.golovi)
				&& Objects.equals(id, other.id) && Objects.equals(klubDomacin, other.klubDomacin)
				&& Objects.equals(klubGost, other.klubGost) && posedDomacin == other.posedDomacin
				&& posedGost == other.posedGost && Objects.equals(rezultat, other.rezultat)
				&& Objects.equals(stadion, other.stadion) && Objects.equals(sudija, other.sudija)
				&& suteviDomacin == other.suteviDomacin && suteviGost == other.suteviGost
				&& suteviUGolDomacin == other.suteviUGolDomacin && suteviUGolGost == other.suteviUGolGost
				&& Objects.equals(takmicenje, other.takmicenje);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDatumIVreme() {
		return datumIVreme;
	}

	public void setDatumIVreme(LocalDateTime datumIVreme) {
		this.datumIVreme = datumIVreme;
	}

	public Klub getKlubDomacin() {
		return klubDomacin;
	}

	public void setKlubDomacin(Klub klubDomacin) {
		this.klubDomacin = klubDomacin;
	}

	public Klub getKlubGost() {
		return klubGost;
	}

	public void setKlubGost(Klub klubGost) {
		this.klubGost = klubGost;
	}

	public int getSuteviDomacin() {
		return suteviDomacin;
	}

	public void setSuteviDomacin(int suteviDomacin) {
		this.suteviDomacin = suteviDomacin;
	}

	public int getSuteviGost() {
		return suteviGost;
	}

	public void setSuteviGost(int suteviGost) {
		this.suteviGost = suteviGost;
	}

	public int getSuteviUGolDomacin() {
		return suteviUGolDomacin;
	}

	public void setSuteviUGolDomacin(int suteviUGolDomacin) {
		this.suteviUGolDomacin = suteviUGolDomacin;
	}

	public int getSuteviUGolGost() {
		return suteviUGolGost;
	}

	public void setSuteviUGolGost(int suteviUGolGost) {
		this.suteviUGolGost = suteviUGolGost;
	}

	public int getPosedDomacin() {
		return posedDomacin;
	}

	public void setPosedDomacin(int posedDomacin) {
		this.posedDomacin = posedDomacin;
	}

	public int getPosedGost() {
		return posedGost;
	}

	public void setPosedGost(int posedGost) {
		this.posedGost = posedGost;
	}

	public List<Gol> getGolovi() {
		return golovi;
	}

	public void setGolovi(List<Gol> golovi) {
		this.golovi = golovi;
	}

	public Stadion getStadion() {
		return stadion;
	}

	public void setStadion(Stadion stadion) {
		this.stadion = stadion;
	}

	public String getRezultat() {
		return rezultat;
	}

	public void setRezultat(String rezultat) {
		this.rezultat = rezultat;
	}

	public Takmicenje getTakmicenje() {
		return takmicenje;
	}

	public void setTakmicenje(Takmicenje takmicenje) {
		this.takmicenje = takmicenje;
	}

	public Sudija getSudija() {
		return sudija;
	}

	public void setSudija(Sudija sudija) {
		this.sudija = sudija;
	}

	@Override
	public String toString() {
		return "Utakmica [id=" + id + ", datumIVreme=" + datumIVreme + ", klubDomacin=" + klubDomacin + ", klubGost="
				+ klubGost + ", suteviDomacin=" + suteviDomacin + ", suteviGost=" + suteviGost + ", suteviUGolDomacin="
				+ suteviUGolDomacin + ", suteviUGolGost=" + suteviUGolGost + ", posedDomacin=" + posedDomacin
				+ ", posedGost=" + posedGost + ", golovi=" + golovi + ", stadion=" + stadion + ", rezultat=" + rezultat
				+ ", takmicenje=" + takmicenje + ", sudija=" + sudija + "]";
	}
	
	
	
}
