package com.sir.projet.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Controle implements Serializable {

	
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		    private Long id;
	   private String libelle;
	   private Date dateExam;
	   private String duree;
	   private int coef;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Date getDateExam() {
		return dateExam;
	}
	public void setDateExam(Date dateExam) {
		this.dateExam = dateExam;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public int getCoef() {
		return coef;
	}
	public void setCoef(int coef) {
		this.coef = coef;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + coef;
		result = prime * result + ((dateExam == null) ? 0 : dateExam.hashCode());
		result = prime * result + ((duree == null) ? 0 : duree.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
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
		Controle other = (Controle) obj;
		if (coef != other.coef)
			return false;
		if (dateExam == null) {
			if (other.dateExam != null)
				return false;
		} else if (!dateExam.equals(other.dateExam))
			return false;
		if (duree == null) {
			if (other.duree != null)
				return false;
		} else if (!duree.equals(other.duree))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Controle [id=" + id + ", libelle=" + libelle + ", dateExam=" + dateExam + ", duree=" + duree + ", coef="
				+ coef + "]";
	}
	   
	   
	   

}
