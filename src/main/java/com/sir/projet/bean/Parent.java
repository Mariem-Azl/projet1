package com.sir.projet.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Parent implements Serializable {
	
	 @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
            private String cin;
	    private String nom;
	    private String prenom;
	    private String tele;
	    private String adresse;
	    private Date dateNaisssance;
	    private String lieuNaissance;
         @OneToMany(mappedBy = "parent")
         List<Etudiant> etudiants;

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
            @OneToOne(mappedBy = "parent")
            private Etudiant etudiant;

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
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
    public String toString() {
        return "Parent{" + "id=" + id + ", cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", tele=" + tele + ", adresse=" + adresse + ", dateNaisssance=" + dateNaisssance + ", lieuNaissance=" + lieuNaissance + ", etudiants=" + etudiants + ", etudiant=" + etudiant + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.cin);
        hash = 89 * hash + Objects.hashCode(this.nom);
        hash = 89 * hash + Objects.hashCode(this.prenom);
        hash = 89 * hash + Objects.hashCode(this.tele);
        hash = 89 * hash + Objects.hashCode(this.adresse);
        hash = 89 * hash + Objects.hashCode(this.dateNaisssance);
        hash = 89 * hash + Objects.hashCode(this.lieuNaissance);
        hash = 89 * hash + Objects.hashCode(this.etudiants);
        hash = 89 * hash + Objects.hashCode(this.etudiant);
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
        final Parent other = (Parent) obj;
        if (!Objects.equals(this.cin, other.cin)) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.tele, other.tele)) {
            return false;
        }
        if (!Objects.equals(this.adresse, other.adresse)) {
            return false;
        }
        if (!Objects.equals(this.lieuNaissance, other.lieuNaissance)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dateNaisssance, other.dateNaisssance)) {
            return false;
        }
        if (!Objects.equals(this.etudiants, other.etudiants)) {
            return false;
        }
        if (!Objects.equals(this.etudiant, other.etudiant)) {
            return false;
        }
        return true;
    }

   		    
	    

}
