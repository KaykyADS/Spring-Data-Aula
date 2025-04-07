package com.exercicio.AulaSpringData.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Projeto")
public class Projeto {
	@Id
	@Column(name = "CodProj", nullable = false)
	private int CodProj;
	@Column(name = "tipo", nullable = false)
	private String tipo;
	@Column(name = "descr", nullable = false)
	private String descr;
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Emp.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "CodEmp", nullable = false)
	private Emp emp;
}
