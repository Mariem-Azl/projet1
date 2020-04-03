package com.sir.projet.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sir.projet.bean.Parent;


@Repository
public interface ParentRepository extends JpaRepository<Parent, Long>{
 
    Parent findByCin(String cin);
    int deleteByCin(String cin);
}
