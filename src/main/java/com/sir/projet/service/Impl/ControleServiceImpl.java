/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.Service.Impl;

import com.sir.projet.Repository.ControleRepository;
import com.sir.projet.Service.facade.ProfesseurService;
import com.sir.projet.Service.facade.SalleSevice;
import com.sir.projet.bean.Controle;
import com.sir.projet.bean.ControleDetails;
import com.sir.projet.bean.Etudiant;
import com.sir.projet.bean.Matiere;
import com.sir.projet.bean.Professeur;
import com.sir.projet.bean.Salle;
import com.sir.projet.service.facade.ControleService;
import com.sir.projet.service.facade.EtudiantService;
import com.sir.projet.service.facade.MatiereService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author aaoub
 */
@Service

public class ControleServiceImpl implements ControleService{
    
    @Autowired
    private ControleRepository controleRepository;
    @Autowired
    private ProfesseurService professeurServic;
    @Autowired
    private SalleSevice salleService;
    @Autowired
    private MatiereService matireService;
    @Autowired
    private EtudiantService etudiantService;
    
    
   
    public Controle findByLibelle(String libelle) {
    return  controleRepository.findByLibelle(libelle);      }

    @Override
    @Transactional
    public int deleteByLibelle(String libelle) {
     return controleRepository.deleteByLibelle(libelle);    }

    @Override
    public List<Controle> findAll() {
         return controleRepository.findAll();    }

    @Override
    public int save(Controle controle) {
        Etudiant etudiant=etudiantService.findByCne(controle.getEtudiant().getCne());
        Controle fControle= controleRepository.findByLibelle(controle.getLibelle());
        Matiere foundMatiere= matireService.findByLibelle(controle.getMatiere().getLibelle());
        Salle foundedSalle= salleService.findByNumero(controle.getSalle().getNumero());
        Professeur foundProf= professeurServic.findByCin(controle.getProfesseur().getCin());
        if(foundMatiere==null){
            return -2;
        }else if(foundProf==null){
            return -3;
        }else if(foundedSalle==null){
            return -4;
        }else if(etudiant==null){
            return -5;
        }else if(fControle!=null){
            return -1;
        }else {
            controle.setNoteAvecCoef(controle.getNote()*controle.getCoef());
            controle.setEtudiant(etudiant);
            controle.setMatiere(foundMatiere);
            controle.setProfesseur(foundProf);
            controle.setSalle(foundedSalle);
            controleRepository.save(controle);
            return 1;
        }
    }

    
    @Override
    public List<Controle> findByControleMatiereLibelle(String libelle) {
        return controleRepository.findByControleMatiereLibelle(libelle);
    }

    @Override
    public List<Controle> finByEtudiantCne(String cne) {
        return controleRepository.finByEtudiantCne(cne);
    }

    
   
        
}
