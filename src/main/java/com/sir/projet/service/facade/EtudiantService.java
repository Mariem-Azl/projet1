/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.service.facade;

import com.sir.projet.bean.Controle;
import com.sir.projet.bean.ControleDetails;
import com.sir.projet.bean.Etudiant;
import java.util.List;

/**
 *
 * @author aaoub
 */
public interface EtudiantService {
    Etudiant findByCne(String cne);
    int DeleteByCne(String cne);
    public int save(Etudiant etudiant);
    List<Etudiant> findAll();
    int validateacces(String cne,String password);

    
}
