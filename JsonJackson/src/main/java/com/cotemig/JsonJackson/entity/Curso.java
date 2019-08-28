package com.cotemig.JsonJackson.entity;

import java.util.List;

public class Curso {
	
	private Integer id;
	private String nome;
	private Integer periodos;
	private List<Turma> turmas;
	
	public Curso() {
        super();
    }
	
	public Curso(Integer id, String nome, Integer periodos, List<Turma> turmas) {
		this.id = id;
		this.nome = nome;
		this.periodos = periodos;
		this.turmas = turmas;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPeriodos() {
		return periodos;
	}

	public void setPeriodos(Integer periodos) {
		this.periodos = periodos;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}
}
