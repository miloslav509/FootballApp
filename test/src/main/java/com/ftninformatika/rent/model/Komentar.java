package com.ftninformatika.rent.model;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Komentar {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private String sadrzaj;
	
	@Column(name = "datum_vreme", nullable = false)
	private LocalDateTime datumIVreme;
	
	@ManyToOne
	private Korisnik korisnik;
	
	@ManyToOne
	private Utakmica utakmica;

	public Komentar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Komentar(Long id, String sadrzaj, LocalDateTime datumIVreme) {
		super();
		this.id = id;
		this.sadrzaj = sadrzaj;
		this.datumIVreme = datumIVreme;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSadrzaj() {
		return sadrzaj;
	}

	public void setSadrzaj(String sadrzaj) {
		this.sadrzaj = sadrzaj;
	}

	public LocalDateTime getDatumIVreme() {
		return datumIVreme;
	}

	public void setDatumIVreme(LocalDateTime datumIVreme) {
		this.datumIVreme = datumIVreme;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public Utakmica getUtakmica() {
		return utakmica;
	}

	public void setUtakmica(Utakmica utakmica) {
		this.utakmica = utakmica;
	}

	@Override
	public int hashCode() {
		return Objects.hash(datumIVreme, id, korisnik, sadrzaj, utakmica);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Komentar other = (Komentar) obj;
		return Objects.equals(datumIVreme, other.datumIVreme) && Objects.equals(id, other.id)
				&& Objects.equals(korisnik, other.korisnik) && Objects.equals(sadrzaj, other.sadrzaj)
				&& Objects.equals(utakmica, other.utakmica);
	}

	@Override
	public String toString() {
		return "Komentar [id=" + id + ", sadrzaj=" + sadrzaj + ", datumIVreme=" + datumIVreme + ", korisnik=" + korisnik
				+ ", utakmica=" + utakmica + "]";
	}
	
	
}
