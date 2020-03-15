package com.sir.projet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sir.projet.bean.ControleDetails;


@Repository
public interface ControleDetailsRepository extends JpaRepository<ControleDetails, Long>{

}
