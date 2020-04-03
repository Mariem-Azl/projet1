/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.WebService;

import com.sir.projet.Service.facade.ParentService;
import com.sir.projet.bean.Parent;
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
@RequestMapping("projetihm/parent")
public class ParentRest {
    
    @Autowired
    private ParentService parentService;

    @PostMapping("/")
    public int save(@RequestBody Parent parent) {
        return parentService.save(parent);
    }

    @GetMapping("/")
    public List<Parent> findAll() {
        return parentService.findAll();
    }

    @GetMapping("/cin/{cin}")
    public Parent findByCin(@PathVariable String cin) {
        return parentService.findByCin(cin);
    }

    @DeleteMapping("d/cin/{cin}")
    public int deleteByCin(String cin) {
        return parentService.deleteByCin(cin);
    }
    
    
    
    
}
