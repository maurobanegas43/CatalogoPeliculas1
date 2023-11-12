package com.example.LoginUsuario.repository;

import com.example.LoginUsuario.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {

}
