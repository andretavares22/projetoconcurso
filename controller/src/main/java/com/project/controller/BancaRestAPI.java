package com.project.controller;

// Aqui criamos a API REST para receber os dados do frontend.
// É como o secretário que recebe os formulários e guarda na gaveta (banco).

import com.project.controller.repository.BancaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/bancas")
public class BancaRestAPI {

    @Autowired
    private BancaRepository repository;

    @PostMapping
    public com.project.model.BancaCadastro criar(@RequestBody com.project.model.BancaCadastro banca) {
        return repository.save(banca);
    }

    @GetMapping
    public List<com.project.model.BancaCadastro> listar() {
        return repository.findAll();
    }
}
