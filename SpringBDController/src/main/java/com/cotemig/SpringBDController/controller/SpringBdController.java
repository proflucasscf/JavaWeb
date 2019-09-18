package com.cotemig.SpringBDController.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cotemig.SpringBDController.model.Aluno;
import com.cotemig.SpringBDController.service.AlunoService;

@Controller
public class SpringBdController {

	@Autowired
	private AlunoService alunoService;
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
    public ModelAndView insert() {
        return new ModelAndView("insert", "aluno", new Aluno());
    }
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String submitInsert(@Valid @ModelAttribute("aluno")Aluno aluno, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		alunoService.insertAluno(aluno);
        
        return "redirect:";
    }
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id) {
		
		return new ModelAndView("delete", "aluno", alunoService.getAlunoById(id).get());
    }
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String submitDelete(@Valid @ModelAttribute("aluno")Aluno aluno,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
		
		alunoService.deleteAlunoById(aluno.getId());
        
        return "redirect:";
    }
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
		
        return new ModelAndView("update", "aluno", alunoService.getAlunoById(id).get());
    }
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
    public String submitUpdate(@Valid @ModelAttribute("aluno")Aluno aluno,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
		
		alunoService.updateAluno(aluno);
        
        return "redirect:";
    }
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
    public ModelAndView read() {
        
        ModelAndView mav = new ModelAndView("read");
        mav.addObject("alunos", alunoService.getAllAlunos());
        return mav;
        
    }
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("alunos", alunoService.getAllAlunos());
        return mav;
        
    }
}
