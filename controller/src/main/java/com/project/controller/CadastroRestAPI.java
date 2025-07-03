// Aqui criamos a API REST para receber os dados do frontend.
// É como o secretário que recebe os formulários e guarda na gaveta (banco).

package com.project.controller;

import com.project.model.Cadastro;
import com.project.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*") //habilitando CORS para não bloquear o envio para o servidor
@RestController
@RequestMapping("/provas")
public class CadastroRestAPI {

    @Autowired
    private Repository repository;

    @PostMapping
    public Cadastro criar(@RequestBody Cadastro cadastro) {
        return repository.save(cadastro);
    }

    @GetMapping
    public List<Cadastro> listar() {
        return repository.findAll();
    }
}
