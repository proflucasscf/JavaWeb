package com.cotemig.JsonJackson.entity;

import java.util.List;

public class Aluno {
	
	private Integer id;
	private String nome;
	private String cpf;
	private Integer idade;
	private List<Disciplina> disciplinas;
	
	public Aluno() {
        super();
    }
	
	public Aluno(Integer id, String nome, String cpf, Integer idade, List<Disciplina> disciplinas) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.disciplinas = disciplinas;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
}
