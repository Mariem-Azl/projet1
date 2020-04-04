/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.WebService;

import com.sir.projet.Service.facade.ProfesseurService;
import com.sir.projet.bean.Etudiant;
import com.sir.projet.bean.Professeur;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author HP
 */
@Controller
@RequestMapping("projetihm/professeur")
public class ProfesseurRest {

@Autowired
private ProfesseurService professeurService;

@PostMapping("/")
    public int save(@RequestBody Professeur professeur) {
        return professeurService.save(professeur);
    }

    @GetMapping("/")
    public List<Professeur> findAll() {
        return professeurService.findAll();
    }

    @GetMapping("/cin/{cin}")
    public Professeur findByCin(@PathVariable String cin) {
        return professeurService.findByCin(cin);
    }

    @DeleteMapping("/d/cin/{cin}")
    public int deleteByCin(String cin) {
        return professeurService.deleteByCin(cin);
    }

    @GetMapping("libelle/{libelle}")
    public Professeur findByMatiereLibelle(@PathVariable String libelle) {
        return professeurService.findByMatiereLibelle(libelle);
    }

    @PostMapping("cin/{cin}/password/{password}")
    public int validate(@PathVariable String cin,@PathVariable String password) {
        return professeurService.validate(cin, password);
    }

    @GetMapping("nom/{nom}")
    public List<Etudiant> findByProfesseurNom(@PathVariable String nom) {
        return professeurService.findByProfesseurNom(nom);
    }
    
    

    
    
}
