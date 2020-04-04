/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.Service.facade;

import com.sir.projet.bean.Salle;
import java.util.List;

/**
 *
 * @author HP
 */
public interface SalleService {
    
     int save(Salle salle);
    List<Salle>findAll();
    Salle findByNumero(String numero);
      int deleteByNumero(String numero);
}
