package com.example.LoginUsuario.controller;

import com.example.LoginUsuario.model.ListaPeliculas;
import com.example.LoginUsuario.model.Pelicula;
import com.example.LoginUsuario.service.PeliculaApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/movies")
public class PeliculaController {

    @Autowired
    private PeliculaApiService peliculaApiService;

    @GetMapping("/search")
    public ListaPeliculas buscar(@RequestParam String query) {
        return peliculaApiService.buscarPelicula(query);
    }

    @GetMapping("/{id}")
    public Pelicula getPelicula(@PathVariable Long id) {
        return peliculaApiService.getPelicula(id);
    }

    @GetMapping("/all")
    public ListaPeliculas getAllPeliculas() {
        return peliculaApiService.getAllPeliculasFromApi();
    }
}
