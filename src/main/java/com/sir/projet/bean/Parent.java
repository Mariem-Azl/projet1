package com.sir.projet.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;


@Entity
public class Parent implements Serializable {
	
	 @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String nom;
	    private String prenom;
	    private String tele;
	    private String adresse;
         @Temporal(javax.persistence.TemporalType.DATE)
	    private Date dateNaisssance;
	    private String lieuNaissance;
            private String cin;

    public String getCin() {
        return cin;
    }

    public void setCni(String cni) {
        this.cin = cin;
    }
            
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getTele() {
			return tele;
		}
		public void setTele(String tele) {
			this.tele = tele;
		}
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		public Date getDateNaisssance() {
			return dateNaisssance;
		}
		public void setDateNaisssance(Date dateNaisssance) {
			this.dateNaisssance = dateNaisssance;
		}
		public String getLieuNaissance() {
			return lieuNaissance;
		}
		public void setLieuNaissance(String lieuNaissance) {
			this.lieuNaissance = lieuNaissance;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
			result = prime * result + ((dateNaisssance == null) ? 0 : dateNaisssance.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((lieuNaissance == null) ? 0 : lieuNaissance.hashCode());
			result = prime * result + ((nom == null) ? 0 : nom.hashCode());
			result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
			result = prime * result + ((tele == null) ? 0 : tele.hashCode());
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
			Parent other = (Parent) obj;
			if (adresse == null) {
				if (other.adresse != null)
					return false;
			} else if (!adresse.equals(other.adresse))
				return false;
			if (dateNaisssance == null) {
				if (other.dateNaisssance != null)
					return false;
			} else if (!dateNaisssance.equals(other.dateNaisssance))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (lieuNaissance == null) {
				if (other.lieuNaissance != null)
					return false;
			} else if (!lieuNaissance.equals(other.lieuNaissance))
				return false;
			if (nom == null) {
				if (other.nom != null)
					return false;
			} else if (!nom.equals(other.nom))
				return false;
			if (prenom == null) {
				if (other.prenom != null)
					return false;
			} else if (!prenom.equals(other.prenom))
				return false;
			if (tele == null) {
				if (other.tele != null)
					return false;
			} else if (!tele.equals(other.tele))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Parent [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", tele=" + tele + ", adresse="
					+ adresse + ", dateNaisssance=" + dateNaisssance + ", lieuNaissance=" + lieuNaissance + "]";
		}
	    
	    
	    

}
