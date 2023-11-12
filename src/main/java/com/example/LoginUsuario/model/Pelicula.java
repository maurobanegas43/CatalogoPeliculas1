package com.example.LoginUsuario.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pelicula")

public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String poster_path;
    private String overview;
    private String backdrop_path;


  public Pelicula(){

  }



}
