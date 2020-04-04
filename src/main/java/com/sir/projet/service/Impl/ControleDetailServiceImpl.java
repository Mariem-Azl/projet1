/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.service.Impl;

import com.sir.projet.Repository.ControleDetailsRepository;
import com.sir.projet.bean.Controle;
import com.sir.projet.bean.ControleDetails;
import com.sir.projet.bean.Etudiant;
import com.sir.projet.service.facade.ControleDetaiServicel;
import com.sir.projet.service.facade.ControleService;
import com.sir.projet.service.facade.EtudiantService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aaoub
 */
@Service
public class ControleDetailServiceImpl implements ControleDetaiServicel {
    @Autowired
    private ControleDetailsRepository controleDetailsRepository;
    @Autowired
    private ControleService controleService;
    @Autowired
    private EtudiantService etudiantService;
    
    
    
   

    @Override
    public int save(List<ControleDetails> controleDetailses, Etudiant etudiant) {
        if(validateControleDetail(etudiant, controleDetailses)){
        for (ControleDetails controleDetailse : controleDetailses) {
            Controle controle=controleService.findByLibelle(controleDetailse.getControle().getLibelle());
            controleDetailse.setControle(controle);
            controleDetailse.setEtudiant(etudiant);   
            controleDetailsRepository.save(controleDetailse);
        }return 1;
        
        }else return -1;  
        
    }
    @Override
    public Boolean validateControleDetail(Etudiant etudiant, List<ControleDetails> controleDetailses) {
     List<ControleDetails> validEtudaintList=controleDetailses.stream().filter(cd ->controleService.findByLibelle(cd.getControle().getLibelle())!=null).collect(Collectors.toList());
         return validEtudaintList.size()==controleDetailses.size();
    }  
    
}
