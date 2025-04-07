package com.exercicio.AulaSpringData.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Emp")
public class Emp {
	@Id
	@Column(name = "CodEmp", nullable = false)
	private int CodEmp;
	@Column(name = "Nome", nullable = false)
	private String Nome;
	@Column(name = "Cat", nullable = false)
	private char Cat;
	@Column(name = "Sal", nullable = false)
	private Double Sal;
	@Column(name = "DataIni", nullable = false)
	private String DataIni;
}
