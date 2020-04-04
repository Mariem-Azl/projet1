/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.Service.Impl;

import com.sir.projet.Repository.MatiereRepository;
import com.sir.projet.bean.Controle;
import com.sir.projet.bean.Matiere;
import com.sir.projet.service.facade.MatiereService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author aaoub
 */
@Service
public class MatireServiceImpl implements MatiereService {

    @Autowired
    private MatiereRepository matiereRepository;
    
    @Override
    public int save(Matiere matiere) {
        Matiere founded=matiereRepository.findByLibelle(matiere.getLibelle());
        if(founded!=null){
            return -1;
        }else{
            matiereRepository.save(matiere);
            return 1;
        }
    }

    @Override
    public Matiere findByLibelle(String libelle) {
        return matiereRepository.findByLibelle(libelle);
    }

    @Transactional
    public int deleteByLibelle(String libelle) {
        return matiereRepository.deleteByLibelle(libelle);
    }

    @Override
    public List<Matiere> findall() {
        return matiereRepository.findAll();
    }

        
}
