package com.sir.projet.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;


@Entity
public class Controle implements Serializable {

	
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
           private Long id;

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }
	   private String libelle;
            @Temporal(javax.persistence.TemporalType.DATE)
	   private Date dateExam;
	   private String duree;
	   private int coef;
           @ManyToOne
           private Matiere matiere;
           @ManyToOne
           private Salle salle;
           @ManyToOne
           private Professeur professeur;
	public Long getId() {
		return id;
	}

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
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
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.libelle);
        hash = 41 * hash + Objects.hashCode(this.dateExam);
        hash = 41 * hash + Objects.hashCode(this.duree);
        hash = 41 * hash + this.coef;
        hash = 41 * hash + Objects.hashCode(this.matiere);
        hash = 41 * hash + Objects.hashCode(this.salle);
        hash = 41 * hash + Objects.hashCode(this.professeur);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Controle other = (Controle) obj;
        if (this.coef != other.coef) {
            return false;
        }
        if (!Objects.equals(this.libelle, other.libelle)) {
            return false;
        }
        if (!Objects.equals(this.duree, other.duree)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dateExam, other.dateExam)) {
            return false;
        }
        if (!Objects.equals(this.matiere, other.matiere)) {
            return false;
        }
        if (!Objects.equals(this.salle, other.salle)) {
            return false;
        }
        if (!Objects.equals(this.professeur, other.professeur)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Controle{" + "id=" + id + ", libelle=" + libelle + ", dateExam=" + dateExam + ", duree=" + duree + ", coef=" + coef + ", matiere=" + matiere + ", salle=" + salle + ", professeur=" + professeur + '}';
    }

    
    

}
