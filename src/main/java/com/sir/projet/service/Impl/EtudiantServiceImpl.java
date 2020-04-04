/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.Service.Impl;

import com.sir.projet.Repository.EtudiantRepository;
import com.sir.projet.Service.facade.ParentService;
import com.sir.projet.bean.Controle;
import com.sir.projet.bean.ControleDetails;
import com.sir.projet.bean.Etudiant;
import com.sir.projet.bean.Parent;
import com.sir.projet.service.facade.ControleDetaiServicel;
import com.sir.projet.service.facade.EtudiantService;
//import com.sir.projet.service.ParentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author aaoub
 */
@Service
public class EtudiantServiceImpl implements EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private ParentService parentService;
    @Autowired
    private ControleDetaiServicel controleDetaiServicel;
    
    
    
    public Etudiant findByCne(String cne) {
      return etudiantRepository.findByCne(cne);    }

    @Override
    @Transactional
    public int DeleteByCne(String cne) {
      return etudiantRepository.DeleteByCne(cne);    }

    @Override
    public int save(Etudiant etudiant) {        
     Etudiant found= etudiantRepository.findByCne(etudiant.getCne());
     Parent foundP=parentService.findByCin(etudiant.getParent().getCin());
     if(found!=null){
         return -1;
     }else if(foundP==null){
         return -2;
     }
     else{
         etudiant.setParent(foundP);
         etudiantRepository.save(etudiant);
         return 1;
     }
    }

    @Override
    public List<Etudiant> findAll() {
        return etudiantRepository.findAll();     }

    @Override
    public int validateacces(String cne, String password) {
        List<Etudiant> lists=etudiantRepository.findAll();
        int i=0;
        for (Etudiant list : lists) {
            if(list.getCne().equals(cne)&& list.getPassword().equals(password) ){
                i=1;
            } else i=-1;    
        }
        return i;
    }

      
}
