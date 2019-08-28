package com.cotemig.JsonJackson.entity;

public class Disciplina {
	
	private Integer id;
	private String nome;
	private Integer horas;
	private String professor;
	
	public Disciplina() {
        super();
    }
	
	public Disciplina(Integer id, String nome, Integer horas, String professor) {
		this.id = id;
		this.nome = nome;
		this.horas = horas;
		this.professor = professor;
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

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}
}
