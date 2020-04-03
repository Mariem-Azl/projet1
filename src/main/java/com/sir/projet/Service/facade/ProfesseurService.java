/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.Service.facade;

import com.sir.projet.bean.Professeur;
import java.util.List;

/**
 *
 * @author HP
 */
public interface ProfesseurService {
     int save(Professeur professeur);
    List<Professeur>findAll();
    Professeur findByCin(String cin);
    int deleteByCin(String cin);
}
