package com.example.LoginUsuario.controller;


import com.example.LoginUsuario.model.Usuario;
import com.example.LoginUsuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    private ResponseEntity<?> listAll(){
        List<Usuario> lista= usuarioService.listAll();
        return ResponseEntity.ok(lista);
    }

    @GetMapping("/{id}")
    private ResponseEntity <?> listById(@PathVariable Long id){
        Usuario usuario = usuarioService.listById(id);
        return ResponseEntity.ok(usuario);

    }
    @PostMapping("/crear")
    private ResponseEntity <?> create(@RequestBody  Usuario usuario){
       Usuario createUsuario= usuarioService.create(usuario);
       return ResponseEntity.ok(createUsuario);

    }







}
