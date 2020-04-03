package com.sir.projet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sir.projet.bean.Salle;


@Repository
public interface SalleRepository extends JpaRepository<Salle, Long>{

    Salle findByNumero(String numero);
     int deleteByNumero(String numero);
}
