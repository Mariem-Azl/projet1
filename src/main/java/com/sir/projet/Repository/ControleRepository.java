package com.sir.projet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sir.projet.bean.Controle;
import java.util.List;


@Repository
public interface ControleRepository extends JpaRepository<Controle, Long>{
    Controle findByLibelle(String libelle);
    int deleteByLibelle(String libelle);
    List<Controle> findByControleMatiereLibelle(String libelle);//pour afficher les controles d'une matiere 
       
    

}
