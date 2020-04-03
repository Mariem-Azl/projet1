/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.Service.Impl;

import com.sir.projet.Repository.ProfesseurRepository;
import com.sir.projet.Service.facade.ProfesseurService;
import com.sir.projet.bean.Professeur;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class ProfesseurServiceImpl implements ProfesseurService{
    @Autowired
    private ProfesseurRepository professeurRepository;

    @Override
    public int save(Professeur professeur) {
        Professeur founded=findByCin(professeur.getCin());

        if(founded!=null){
            return -1;
        }
            else{
             professeurRepository.save(professeur);
      
             return 1;
        }
    }

    @Override
    public List<Professeur> findAll() {

        return professeurRepository.findAll();
    }

    @Override
    public Professeur findByCin(String cin) {

        return professeurRepository.findByCin(cin);
    }

    @Transactional
    public int deleteByCin(String cin) {

        return professeurRepository.deleteByCin(cin);
    }
    
    
}
