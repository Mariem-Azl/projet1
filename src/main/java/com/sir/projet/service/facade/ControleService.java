/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.service.facade;

import com.sir.projet.bean.Controle;
import java.util.List;

/**
 *
 * @author aaoub
 */
public interface ControleService {
     Controle FindByLibelle(String libelle);
    int deleteByLibelle(String libelle);
    List<Controle> findAll();
    int save(Controle controle);

    
}
