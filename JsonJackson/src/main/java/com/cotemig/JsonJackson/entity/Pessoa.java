package com.cotemig.JsonJackson.entity;

public class Pessoa {
	
	private Integer id;
	private String nome;
	
	public Pessoa() {
        super();
    }
	
	public Pessoa(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public long getId() {
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
}
