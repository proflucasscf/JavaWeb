package com.cotemig.JsonJackson.entity;

import java.util.List;

public class Faculdade {
	
	private Integer id;
	private String nome;
	private String endereco;
	private List<Curso> cursos;

	public Faculdade() {
        super();
    }
	
	public Faculdade(Integer id, String nome, String endereco, List<Curso> cursos) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cursos = cursos;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
}
