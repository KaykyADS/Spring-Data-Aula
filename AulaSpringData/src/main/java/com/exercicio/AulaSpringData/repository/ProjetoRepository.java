package com.exercicio.AulaSpringData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio.AulaSpringData.model.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {

}
