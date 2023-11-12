package com.example.LoginUsuario.model;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "usuario")

public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String gmail;

    public Usuario() {
    }

}
