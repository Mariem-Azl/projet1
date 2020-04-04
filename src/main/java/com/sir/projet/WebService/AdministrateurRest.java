/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.WebService;

import com.sir.projet.Service.facade.AdministrateurService;
import com.sir.projet.bean.Administrateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@RequestMapping("projetihm/administrateur")
public class AdministrateurRest {
    @Autowired
    private AdministrateurService administrateurService;

    @PostMapping("/")
    public int save(@RequestBody Administrateur administrateur) {
        return administrateurService.save(administrateur);
    }

    @GetMapping("/code/{code}")
    public Administrateur findByCode( @PathVariable String code) {
        return administrateurService.findByCode(code);
    }

    @PostMapping("/login/{login}/password/{password}/code/{code}")
    public int validate(@PathVariable String login,@PathVariable String password,@PathVariable String code) {
        return administrateurService.validate(login, password, code);
    }
    
    
    
}
