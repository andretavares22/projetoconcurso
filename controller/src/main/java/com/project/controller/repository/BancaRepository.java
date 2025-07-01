package com.project.controller.repository;

import com.project.model.Banca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancaRepository extends JpaRepository<Banca, Long> {
}