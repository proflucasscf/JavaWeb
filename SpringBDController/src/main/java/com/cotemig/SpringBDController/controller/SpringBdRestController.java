package com.cotemig.SpringBDController.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cotemig.SpringBDController.model.Aluno;
import com.cotemig.SpringBDController.service.AlunoService;

@RestController
public class SpringBdRestController {
	
	@Autowired
	private AlunoService alunoService;
	
    @RequestMapping(value = "/rest/getAll", method = RequestMethod.GET)
    public List<Aluno> getAlunos() {
		return alunoService.getAllAlunos();
	}

    @RequestMapping(value = "/rest/get/{id}", method = RequestMethod.GET)
    public Optional<Aluno> getAluno(@PathVariable("id") Integer id) {
		return alunoService.getAlunoById(id);
	}
    
    @RequestMapping(value = "/rest/deleteAll", method = RequestMethod.DELETE)
    public void deleteAlunos() {
    	alunoService.deleteAllAlunos();
	}
    
    @RequestMapping(value = "/rest/delete/{id}", method = RequestMethod.DELETE)
    public void deleteAluno(@PathVariable("id") Integer id) {
		alunoService.deleteAlunoById(id);
	}
    
    @RequestMapping(value = "/rest/update/{id}", method = RequestMethod.POST)
    public void updateAluno(@RequestBody Aluno aluno, @PathVariable("id") Integer id) {
    	alunoService.updateAlunoById(id, aluno);
	}
    
    @RequestMapping(value = "/rest/insert", method = RequestMethod.POST)
    public void updateAluno(@RequestBody Aluno aluno) {
		alunoService.insertAluno(aluno);
	}
}
