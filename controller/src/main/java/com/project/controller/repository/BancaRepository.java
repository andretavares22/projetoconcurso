package com.project.controller.repository;

// Esta é a interface que fala com o banco de dados.
// Aqui o Spring vai criar automaticamente as operações de salvar, buscar, deletar etc.

import com.project.model.BancaCadastro;
import com.project.model.BancaCadastro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancaRepository extends JpaRepository<BancaCadastro, Long> {
}