/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.WebService;

import com.sir.projet.bean.Controle;
import com.sir.projet.bean.Etudiant;
import com.sir.projet.service.facade.ControleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author aaoub
 */
@RestController
@RequestMapping("ihm/controle")
public class ControleRest {
    @Autowired
   private  ControleService controleService;
    
    @GetMapping("/etudiant/cne/{cne}")
    public List<Controle> findByEtudiantCne(@PathVariable String cne) {
        return controleService.findByEtudiantCne(cne);
    }
    
    @GetMapping("/matiere/libelle/{libelle}")
    public List<Controle> findByMatiereLibelle(@PathVariable String libelle) {
        return controleService.findByMatiereLibelle(libelle);
    }
    
    @GetMapping("/libelle/{libelle}")
    public Controle findByLibelle(@PathVariable String libelle) {
        return controleService.findByLibelle(libelle);
    }
    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return controleService.deleteByLibelle(libelle);
    }
    
    @GetMapping("/")
    public List<Controle> findAll() {
        return controleService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody Controle controle) {
        return controleService.save(controle);
    }
    
    
}
