package com.example.LoginUsuario.service;

import com.example.LoginUsuario.model.Usuario;

import java.util.List;


public interface UsuarioService {

    List <Usuario> listAll();
    Usuario listById(Long id);
    Usuario create(Usuario usuario);
    Usuario update(Usuario usuario);
    void deleteById(Long id);



}


