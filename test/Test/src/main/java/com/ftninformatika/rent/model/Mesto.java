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
import javax.persistence.OneToMany;
import javax.websocket.OnError;

@Entity
public class Mesto {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private String grad;
	
	@Column(nullable = false)
	private String drzava;
	
	@OneToMany(mappedBy = "mesto", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Festival> festivali = new ArrayList<>();

	public Mesto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mesto(String grad, String drzava) {
		super();
		this.grad = grad;
		this.drzava = drzava;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((drzava == null) ? 0 : drzava.hashCode());
		result = prime * result + ((grad == null) ? 0 : grad.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Mesto other = (Mesto) obj;
		if (drzava == null) {
			if (other.drzava != null)
				return false;
		} else if (!drzava.equals(other.drzava))
			return false;
		if (grad == null) {
			if (other.grad != null)
				return false;
		} else if (!grad.equals(other.grad))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

	public List<Festival> getFestivali() {
		return festivali;
	}

	public void setFestivali(List<Festival> festivali) {
		this.festivali = festivali;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public String getDrzava() {
		return drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	@Override
	public String toString() {
		return "Mesto [id=" + id + ", grad=" + grad + ", drzava=" + drzava + "]";
	}
	
	
}
