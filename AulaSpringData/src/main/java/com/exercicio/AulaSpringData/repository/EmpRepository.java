package com.exercicio.AulaSpringData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercicio.AulaSpringData.model.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer> {

}
