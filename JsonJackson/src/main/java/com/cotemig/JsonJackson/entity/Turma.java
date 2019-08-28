package com.cotemig.JsonJackson.entity;

import java.util.List;

public class Turma {
	
	private Integer id;
	private String nome;
	private Integer periodo;
	private List<Aluno> alunos;
	
	public Turma() {
        super();
    }
	
	public Turma(Integer id, String nome, Integer periodo, List<Aluno> alunos) {
		this.id = id;
		this.nome = nome;
		this.periodo = periodo;
		this.alunos = alunos;
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

	public Integer getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
}
