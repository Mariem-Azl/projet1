/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.WebService;

import com.sir.projet.Service.facade.SalleSevice;
import com.sir.projet.bean.Salle;
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
@RequestMapping("projetihm/salle")
public class SalleRest {
    @Autowired
    private SalleSevice salleSevice;

    @PostMapping("/")
    public int save(@RequestBody Salle salle) {
        return salleSevice.save(salle);
    }

    @GetMapping("/")
    public List<Salle> findAll() {
        return salleSevice.findAll();
    }

    @GetMapping("/numero/{numero}")
    public Salle findByNumero(@PathVariable String numero) {
        return salleSevice.findByNumero(numero);
    }

    @DeleteMapping("/num/{numero}")
    public int deleteByNumero(@PathVariable String numero) {
        return salleSevice.deleteByNumero(numero);
    }
    
    
    
}
