/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.WebService;

import com.sir.projet.bean.ControleDetails;
import com.sir.projet.bean.Etudiant;
import com.sir.projet.service.facade.EtudiantService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author aaoub
 */
@RestController
@RequestMapping("ihm/etudiant")

public class EtudiantRest {
   @Autowired
   private EtudiantService etudiantService; 
    
   @GetMapping("/cne/{cne}")
    public Etudiant findByCne(String cne) {
        return etudiantService.findByCne(cne);
    }
    @DeleteMapping("/cne/{cne}")
    public int DeleteByCne(String cne) {
        return etudiantService.deleteByCne(cne);
    }
    @PostMapping("/")
    public int save(@RequestBody Etudiant etudiant) {
        return etudiantService.save(etudiant);
    }
    @GetMapping("/")
    public List<Etudiant> findAll() {
        return etudiantService.findAll();
    }
    @PostMapping("/cne/{cne}/password/{password}")
    public int validateacces(String cne, String password) {
        return etudiantService.validateacces(cne, password);
    }
   
    
}
