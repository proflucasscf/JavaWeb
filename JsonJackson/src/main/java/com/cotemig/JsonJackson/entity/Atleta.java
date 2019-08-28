package com.cotemig.JsonJackson.entity;

public class Atleta {
	
	private Integer id;
	private String nome;
	private Integer idade;
	private String modalidade;
	private String posicao;
	
	public Atleta() {
        super();
    }
	
	public Atleta(Integer id, String nome, Integer idade, String modalidade, String posicao) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.modalidade = modalidade;
		this.posicao = posicao;
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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
}
