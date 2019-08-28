package com.cotemig.JsonJackson.entity;

import java.util.List;

public class Time {
	
	private Integer id;
	private String nome;
	private List<Atleta> atletas;
	
	public Time() {
        super();
    }
	
	public Time(Integer id, String nome, List<Atleta> atletas) {
		this.id = id;
		this.nome = nome;
		this.atletas = atletas;
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
	public List<Atleta> getAtletas() {
		return atletas;
	}
	public void setAtletas(List<Atleta> atletas) {
		this.atletas = atletas;
	}
	
}