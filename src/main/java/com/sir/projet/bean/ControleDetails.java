package com.sir.projet.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ControleDetails implements Serializable {

	
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long id;
	
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((noteAvecCoef == null) ? 0 : noteAvecCoef.hashCode());
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
		ControleDetails other = (ControleDetails) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		if (noteAvecCoef == null) {
			if (other.noteAvecCoef != null)
				return false;
		} else if (!noteAvecCoef.equals(other.noteAvecCoef))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ControleDetails [id=" + id + ", note=" + note + ", noteAvecCoef=" + noteAvecCoef + "]";
	}
	   

}
