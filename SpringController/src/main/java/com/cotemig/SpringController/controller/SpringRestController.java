package com.cotemig.SpringController.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringRestController extends BaseController {
	
	@RequestMapping(value = "/rest/insert", method = RequestMethod.POST)
	public void insert(String aluno, HttpServletResponse httpResponse) throws IOException {
		
		alunos.add(aluno);
		
		httpResponse.sendRedirect("/insert");
	}
	
	@RequestMapping(value = "/rest/delete", method = RequestMethod.POST)
	public void delete(String aluno, HttpServletResponse httpResponse) throws IOException {
		
		if (alunos.contains(aluno)) {
			alunos.remove(aluno);
		}
		
		httpResponse.sendRedirect("/delete");
	}
	
	@RequestMapping(value = "/rest/update", method = RequestMethod.POST)
	public void update(String aluno, String newAluno, HttpServletResponse httpResponse) throws IOException {
		
		if (alunos.contains(aluno)) {
			int indexAluno = alunos.indexOf(aluno);
			alunos.set(indexAluno, newAluno);
		}
		
		httpResponse.sendRedirect("/update");
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public List<String> read() {
		return alunos;
	}
	
	
}
