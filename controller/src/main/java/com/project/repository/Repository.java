// Esta é a interface que fala com o banco de dados.
// Aqui o Spring vai criar automaticamente as operações de salvar, buscar, deletar etc.

package com.project.repository;

import com.project.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Cadastro, Short> {
}