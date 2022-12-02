package com.example.ApiG46.Repositorios;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.ApiG46.Modelos.UsuarioModelo;

@Repository
public interface UsuarioRepositorio extends MongoRepository<UsuarioModelo,Long> {
    ArrayList<UsuarioModelo> findByApellido(String apellido);
    
}
