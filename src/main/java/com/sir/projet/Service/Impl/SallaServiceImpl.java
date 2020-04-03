/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.projet.Service.Impl;

import com.sir.projet.Repository.SalleRepository;
import com.sir.projet.Service.facade.SalleSevice;
import com.sir.projet.bean.Salle;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public class SallaServiceImpl implements SalleSevice{

    @Autowired
    private SalleRepository salleRepository;
    @Override
    public int save(Salle salle) {

        Salle founded=findByNumero(salle.getNumero());

        if(founded!=null){
            return -1;
        }
            else{
             salleRepository.save(salle);
      
             return 1;
        }    }

    @Override
    public List<Salle> findAll() {

        return salleRepository.findAll();
    }

    @Override
    public Salle findByNumero(String numero) {

        return salleRepository.findByNumero(numero);
    }

   @Transactional
    public int deleteByNumero(String numero) {
     return salleRepository.deleteByNumero(numero);
    }
    
    
}
