package com.sir.projet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sir.projet.bean.Etudiant;


@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{
    Etudiant findByCne(String cne);
    int DeleteByCne(String cne);
    

}
