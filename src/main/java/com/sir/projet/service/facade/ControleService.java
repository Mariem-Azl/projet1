/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.service.facade;

import com.sir.projet.bean.Controle;
import com.sir.projet.bean.Etudiant;
import java.util.List;

/**
 *
 * @author aaoub
 */
public interface ControleService {
    Controle findByLibelle(String libelle);
    int deleteByLibelle(String libelle);
    List<Controle> findAll();
    int save(Controle controle);
    List<Controle> findByControleMatiereLibelle(String libelle);
    List<Controle> finByEtudiantCne(String cne);
    
    
}
