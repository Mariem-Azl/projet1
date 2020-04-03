package com.sir.projet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sir.projet.bean.Matiere;


@Repository
public interface MatiereRepository extends JpaRepository<Matiere, Long>{
    Matiere findByLibelle(String libelle);
    int deleteByLibelle(String libelle);
    

}
