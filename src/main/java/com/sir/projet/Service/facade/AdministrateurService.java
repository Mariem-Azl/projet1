/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.Service.facade;

import com.sir.projet.bean.Administrateur;

/**
 *
 * @author HP
 */
public interface AdministrateurService {
    
    int save(Administrateur administrateur);

  Administrateur findByCode(String code);
    
}
