package com.sir.projet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sir.projet.bean.Controle;


@Repository
public interface ControleRepository extends JpaRepository<Controle, Long>{
    Controle FindByLibelle(String libelle);
    int deleteByLibelle(String libelle);
    

}
