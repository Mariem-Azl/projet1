/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.Service.Impl;

import com.sir.projet.Repository.ControleRepository;
import com.sir.projet.bean.Controle;
import com.sir.projet.service.facade.ControleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aaoub
 */
@Service

public class ControleServiceImpl implements ControleService{
    
    @Autowired
    ControleRepository controleRepository;
    
    @Override
    public Controle FindByLibelle(String libelle) {
    return   controleRepository.FindByLibelle(libelle);     }

    @Override
    public int deleteByLibelle(String libelle) {
     return controleRepository.deleteByLibelle(libelle);    }

    @Override
    public List<Controle> findAll() {
         return controleRepository.findAll();    }

    @Override
    public int save(Controle controle) {
        Controle fControle= controleRepository.FindByLibelle(controle.getLibelle());
        if(fControle!=null){
            return -1;
        }else{
            controleRepository.save(controle);
            return 1;
        }
    }
    
}
