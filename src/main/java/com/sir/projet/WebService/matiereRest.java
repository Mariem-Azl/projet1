/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.WebService;

import com.sir.projet.bean.Matiere;
import com.sir.projet.service.facade.MatiereService;
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
 * @author aaoub
 */
@Controller
@RequestMapping("projetihm/matiere")
public class matiereRest {
    @Autowired
    private MatiereService matiereService;
    
    @PostMapping("/")
    public int save(@RequestBody Matiere matiere) {
        return matiereService.save(matiere);
    }

    @GetMapping("/libelle/{libelle}")
    public Matiere findByLibelle(@PathVariable String libelle) {
        return matiereService.findByLibelle(libelle);
    }
    
    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle(@PathVariable String libelle) {
        return matiereService.deleteByLibelle(libelle);
    }
    
    @GetMapping("/")
    public List<Matiere> findall() {
        return matiereService.findall();
    }
    
    
}
