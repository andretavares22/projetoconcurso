package com.project.controller;

import com.project.controller.repository.BancaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bancas")
public class Banca {

    @Autowired
    private BancaRepository repository;

    @PostMapping
    public com.project.model.Banca criar(@RequestBody com.project.model.Banca banca) {
        return repository.save(banca);
    }

    @GetMapping
    public List<com.project.model.Banca> listar() {
        return repository.findAll();
    }
}
