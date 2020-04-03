package com.sir.projet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sir.projet.bean.Administrateur;


@Repository
public interface AdministrateurRepository extends JpaRepository<Administrateur, Long>{

    Administrateur findBycode(String code);
}
