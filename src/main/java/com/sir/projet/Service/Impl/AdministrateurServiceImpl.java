/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.Service.Impl;

import com.sir.projet.Repository.AdministrateurRepository;
import com.sir.projet.Service.facade.AdministrateurService;
import com.sir.projet.bean.Administrateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class AdministrateurServiceImpl implements AdministrateurService{

     @Autowired
    private AdministrateurRepository administrateurRepository;
    @Override
    public int save(Administrateur administrateur) {
    Administrateur founded=findByCode(administrateur.getCode());

        if(founded!=null){
            return -1;
        }
            else{
             administrateurRepository.save(administrateur);
      
             return 1;
        }
           }

    @Override
    public Administrateur findByCode(String code) {
        return administrateurRepository.findBycode(code);
    }
    
    
    
}
