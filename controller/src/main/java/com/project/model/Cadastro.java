//Esta classe é a ficha de cadastro de cada prova.

package com.project.model;

import jakarta.persistence.*;

@Entity
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;

    private String banca;
    private String orgao;
    private Short questoesgerais;
    private Short questoesespecificas;
    private String discursiva;
    private Short ano;

    public Cadastro() {}

    public Cadastro(String banca, String orgao, short questoesgerais, short questoesespecificas, String discursiva, short ano) {
        this.banca = banca;
        this.orgao = orgao;
        this.questoesgerais = questoesgerais;
        this.questoesespecificas = questoesespecificas;
        this.discursiva = discursiva;
        this.ano = ano;
    }
// Getters and setters gerados com o botão direito (generate)

    public Short getId() {return id;}

    public String getBanca() {return banca;}
    public void setBanca(String banca) {this.banca = banca;}
    public String getOrgao() {return orgao;}
    public void setOrgao(String orgao) {this.orgao = orgao;}
    public Short getQuestoesgerais() {return questoesgerais;}
    public void setQuestoesgerais(Short questoesgerais) {this.questoesgerais = questoesgerais;}
    public Short getQuestoesespecificas() {return questoesespecificas;}
    public void setQuestoesespecificas(Short questoesespecificas) {this.questoesespecificas = questoesespecificas;}
    public String getDiscursiva() {return discursiva;}
    public void setDiscursiva(String discursiva) {this.discursiva = discursiva;}
    public Short getAno() {return ano;}
    public void setAno(Short ano) {this.ano = ano;}

    //Getters and setters anteriores
    /*
    public Short getId() { return id; }
    public String getNome() { return banca; }
    public void setNome(String nome) { this.banca = nome; }
    public String getAbreviatura() { return orgao; }
    public void setAbreviatura(String abreviatura) { this.orgao = abreviatura; }
    */

    }