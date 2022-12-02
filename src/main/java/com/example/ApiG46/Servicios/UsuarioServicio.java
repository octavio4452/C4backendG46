package com.example.ApiG46.Servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ApiG46.Modelos.UsuarioModelo;
import com.example.ApiG46.Repositorios.UsuarioRepositorio;

@Service
public class UsuarioServicio {
    @Autowired
    UsuarioRepositorio repositorio;

    public UsuarioModelo guardaUsuario(UsuarioModelo usuario){
        return repositorio.save(usuario);
    }

    public ArrayList<UsuarioModelo> consultar(){
        return (ArrayList<UsuarioModelo>) repositorio.findAll();
    }

    public Optional<UsuarioModelo> consultarDocumento(Long documento){

        return repositorio.findById(documento);

    }//

    public boolean eliminarUsuario(Long documento){
        if (repositorio.existsById(documento)){
            repositorio.deleteById(documento);
            return true;
        }
        else{
            return false;
        }
    }// cierre eliminar usuario

    public ArrayList<UsuarioModelo> buscarXapellido(String apellido){
        return repositorio.findByApellido(apellido);
    }


}