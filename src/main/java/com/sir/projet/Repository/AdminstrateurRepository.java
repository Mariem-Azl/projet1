package com.sir.projet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sir.projet.bean.Administrateur;


@Repository
public interface AdminstrateurRepository extends JpaRepository<Administrateur, Long>{

}
