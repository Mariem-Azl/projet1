/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.Service.facade;

import com.sir.projet.bean.Parent;
import java.util.List;

/**
 *
 * @author HP
 */
public interface ParentService {
    
    int save(Parent parent);
    List<Parent>findAll();
    Parent findByCin(String cin);
    int deleteByCin(String cin);
}
