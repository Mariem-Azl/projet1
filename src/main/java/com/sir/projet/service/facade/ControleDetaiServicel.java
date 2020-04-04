/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.service.facade;

import com.sir.projet.bean.ControleDetails;
import com.sir.projet.bean.Etudiant;
import java.util.List;

/**
 *
 * @author aaoub
 */
public interface ControleDetaiServicel {
     public int save(List<ControleDetails> controleDetailses, Etudiant etudiant);
     public Boolean validateControleDetail(Etudiant etudiant, List<ControleDetails> controleDetailses);
}
