/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.Service.Impl;

import com.sir.projet.Repository.ParentRepository;
import com.sir.projet.Service.facade.ParentService;
import com.sir.projet.bean.Parent;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class ParentServiceImpl implements ParentService{
    @Autowired
    private ParentRepository parentRepository;
    @Override
    public int save(Parent parent) {
     Parent founded=findByCin(parent.getCin());

        if(founded!=null){
            return -1;
        }
            else{
             parentRepository.save(parent);
      
             return 1;
        }
    }

    @Override
    public List<Parent> findAll() {
        return parentRepository.findAll();
    }

    @Override
    public Parent findByCin(String cin) {
        return parentRepository.findByCin(cin);
    }

    @Transactional
    public int deleteByCin(String cin) {

        return parentRepository.deleteByCin(cin);
    }
    
    
    
}
