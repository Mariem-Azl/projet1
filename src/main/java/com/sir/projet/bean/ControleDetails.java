package com.sir.projet.bean;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ControleDetails implements Serializable {

	
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	   private Long id;
           @ManyToOne
           private Etudiant etudiant;
           @ManyToOne
           private Controle controle;
	   private Double note;
	   private Double noteAvecCoef;
	public Double getNote() {
		return note;
	}
	public void setNote(Double note) {
		this.note = note;
	}
	public Double getNoteAvecCoef() {
		return noteAvecCoef;
	}
	public void setNoteAvecCoef(Double noteAvecCoef) {
		this.noteAvecCoef = noteAvecCoef;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Controle getControle() {
        return controle;
    }

    public void setControle(Controle controle) {
        this.controle = controle;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.etudiant);
        hash = 67 * hash + Objects.hashCode(this.controle);
        hash = 67 * hash + Objects.hashCode(this.note);
        hash = 67 * hash + Objects.hashCode(this.noteAvecCoef);
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
        final ControleDetails other = (ControleDetails) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.etudiant, other.etudiant)) {
            return false;
        }
        if (!Objects.equals(this.controle, other.controle)) {
            return false;
        }
        if (!Objects.equals(this.note, other.note)) {
            return false;
        }
        if (!Objects.equals(this.noteAvecCoef, other.noteAvecCoef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ControleDetails{" + "id=" + id + ", etudiant=" + etudiant + ", controle=" + controle + ", note=" + note + ", noteAvecCoef=" + noteAvecCoef + '}';
    }
	
}
