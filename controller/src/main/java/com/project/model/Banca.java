package com.project.model;

import jakarta.persistence.*;

@Entity
public class Banca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String abreviatura;

    public Banca() {}

    public Banca(String nome, String abreviatura) {
        this.nome = nome;
        this.abreviatura = abreviatura;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getAbreviatura() { return abreviatura; }
    public void setAbreviatura(String abreviatura) { this.abreviatura = abreviatura; }
}

