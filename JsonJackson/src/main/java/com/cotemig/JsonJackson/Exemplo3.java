package com.cotemig.JsonJackson;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import com.cotemig.JsonJackson.entity.Aluno;
import com.cotemig.JsonJackson.entity.Curso;
import com.cotemig.JsonJackson.entity.Disciplina;
import com.cotemig.JsonJackson.entity.Faculdade;
import com.cotemig.JsonJackson.entity.Turma;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Exemplo3 {
	
	public static void execute() throws JsonGenerationException, JsonMappingException, IOException {
		
		// Disciplinas
		Disciplina d1 = new Disciplina(1, "POO", 100, "Prof. Leonardo Tavares");
		Disciplina d2 = new Disciplina(2, "Mobile", 80, "Prof. Dirceu");
		Disciplina d3 = new Disciplina(3, "Web", 80, "Prof. Lucas");
		Disciplina d4 = new Disciplina(4, "AEDs", 100, "Prof. Virgílio");
		
		List<Disciplina> disciplinas1 = new ArrayList<Disciplina>();
		disciplinas1.add(d1);
		disciplinas1.add(d2);
		
		List<Disciplina> disciplinas2 = new ArrayList<Disciplina>();
		disciplinas2.add(d3);
		disciplinas2.add(d4);
		
		// Alunos
		Aluno a1 = new Aluno(1, "Joao", "0101010101", 25, disciplinas1);
		Aluno a2 = new Aluno(2, "Maria", "0202020202", 26, disciplinas2);
		Aluno a3 = new Aluno(3, "Jose", "030303030303", 30, disciplinas1);
		Aluno a4 = new Aluno(4, "Renata", "040404040404", 21, disciplinas2);
		
		List<Aluno> alunosADS1 = new ArrayList<Aluno>();
		alunosADS1.add(a1);
		alunosADS1.add(a2);
		
		List<Aluno> alunosADS2 = new ArrayList<Aluno>();
		alunosADS2.add(a3);
		alunosADS2.add(a4);
		
		List<Aluno> alunosSI1 = new ArrayList<Aluno>();
		alunosSI1.add(a1);
		alunosSI1.add(a3);
		
		List<Aluno> alunosSI2 = new ArrayList<Aluno>();
		alunosSI2.add(a2);
		alunosSI2.add(a4);
		
		// Turmas
		Turma turma1 = new Turma(1, "ADS1", 1, alunosADS1);
		Turma turma2 = new Turma(2, "ADS2", 4, alunosADS2);
		List<Turma> turmasAnalise = new ArrayList<Turma>();
		turmasAnalise.add(turma1);
		turmasAnalise.add(turma2);
		
		Turma turma3 = new Turma(1, "SI1", 5, alunosSI1);
		Turma turma4 = new Turma(2, "SI2", 6, alunosSI2);
		List<Turma> turmasSistemas = new ArrayList<Turma>();
		turmasSistemas.add(turma3);
		turmasSistemas.add(turma4);
		
		// Cursos
		Curso curso1 = new Curso(1, "Análise e Desenvol​vimento de Sistemas", 8, turmasAnalise);
		
		Curso curso2 = new Curso(2, "Sistemas de Informação", 8, turmasSistemas);
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(curso1);
		cursos.add(curso2);
		
		// Faculdade
		Faculdade faculdade = new Faculdade(1, "Cotemig", "R. Santa Cruz, 546", cursos);
    	
		// -------------------------------------
		
    	// Serialize
    	String json = serialize(faculdade);
    	System.out.println(json);
    	
    	// Deserialize
    	Faculdade faculdadeDeserialized = deserialize(json);
    	System.out.println(faculdadeDeserialized); 
	}
	
	private static Faculdade deserialize(String json) throws JsonParseException, JsonMappingException, IOException {
        
    	ObjectMapper mapper = new ObjectMapper();
    	
    	return mapper.readValue(json, new TypeReference<Faculdade>(){});
    }
    
    private static String serialize(Faculdade faculdade) throws JsonGenerationException, JsonMappingException, IOException {
    	
    	ObjectMapper mapper = new ObjectMapper();
    	
    	// Serialize
    	StringWriter writer = new StringWriter();
        mapper.writeValue(writer, faculdade);
        
        return writer.toString();
    }
}
