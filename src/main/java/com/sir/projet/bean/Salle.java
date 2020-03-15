package com.sir.projet.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Salle implements Serializable {

	
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		    private Long id;
	   private String numero;
	   private String capacité;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCapacité() {
		return capacité;
	}
	public void setCapacité(String capacité) {
		this.capacité = capacité;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capacité == null) ? 0 : capacité.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
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
		Salle other = (Salle) obj;
		if (capacité == null) {
			if (other.capacité != null)
				return false;
		} else if (!capacité.equals(other.capacité))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Salle [id=" + id + ", numero=" + numero + ", capacité=" + capacité + "]";
	}
	   
}
