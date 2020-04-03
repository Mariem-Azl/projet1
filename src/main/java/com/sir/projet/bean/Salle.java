package com.sir.projet.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Salle implements Serializable {

	
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		    private Long id;
	   private String numero;
	   private String capacité;
           @OneToMany(mappedBy = "salle")
           List<Controle> controlesSalle;
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

    public List<Controle> getControlesSalle() {
        return controlesSalle;
    }

    public void setControlesSalle(List<Controle> controlesSalle) {
        this.controlesSalle = controlesSalle;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.numero);
        hash = 41 * hash + Objects.hashCode(this.capacité);
        hash = 41 * hash + Objects.hashCode(this.controlesSalle);
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
        final Salle other = (Salle) obj;
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.capacité, other.capacité)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.controlesSalle, other.controlesSalle)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Salle{" + "id=" + id + ", numero=" + numero + ", capacit\u00e9=" + capacité + ", controlesSalle=" + controlesSalle + '}';
    }
	
}
