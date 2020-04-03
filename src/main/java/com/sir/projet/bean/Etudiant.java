package com.sir.projet.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Etudiant implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String lieuNaissance;
    private String sex;
    private String cne;
    private String password;
    @OneToMany(mappedBy = "etudiant")
    private List<ControleDetails> controleDetails;
    @ManyToOne
    private Parent parent;

    public Parent getParent() {
        return parent;
    }

    public List<ControleDetails> getControleDetails() {
        return controleDetails;
    }

    public void setControleDetails(List<ControleDetails> controleDetails) {
        this.controleDetails = controleDetails;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
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
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getLieuNaissance() {
		return lieuNaissance;
	}
	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCne() {
		return cne;
	}
	public void setCne(String cne) {
		this.cne = cne;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.id);
        hash = 13 * hash + Objects.hashCode(this.nom);
        hash = 13 * hash + Objects.hashCode(this.prenom);
        hash = 13 * hash + Objects.hashCode(this.dateNaissance);
        hash = 13 * hash + Objects.hashCode(this.lieuNaissance);
        hash = 13 * hash + Objects.hashCode(this.sex);
        hash = 13 * hash + Objects.hashCode(this.cne);
        hash = 13 * hash + Objects.hashCode(this.password);
        hash = 13 * hash + Objects.hashCode(this.controleDetails);
        hash = 13 * hash + Objects.hashCode(this.parent);
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
        final Etudiant other = (Etudiant) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.lieuNaissance, other.lieuNaissance)) {
            return false;
        }
        if (!Objects.equals(this.sex, other.sex)) {
            return false;
        }
        if (!Objects.equals(this.cne, other.cne)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dateNaissance, other.dateNaissance)) {
            return false;
        }
        if (!Objects.equals(this.controleDetails, other.controleDetails)) {
            return false;
        }
        if (!Objects.equals(this.parent, other.parent)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", lieuNaissance=" + lieuNaissance + ", sex=" + sex + ", cne=" + cne + ", password=" + password + ", controleDetails=" + controleDetails + ", parent=" + parent + '}';
    }

       

}
