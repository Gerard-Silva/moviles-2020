/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitec.topo;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface RepoPerfil extends MongoRepository<Perfil,String>{
    
}