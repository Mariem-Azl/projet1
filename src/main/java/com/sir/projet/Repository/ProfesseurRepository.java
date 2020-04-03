package com.sir.projet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sir.projet.bean.Professeur;


@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur, Long>{

    Professeur findByCin(String cin);
     int deleteByCin(String cin);
}
