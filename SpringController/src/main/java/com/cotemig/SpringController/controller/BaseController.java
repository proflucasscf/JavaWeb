package com.cotemig.SpringController.controller;

import java.util.ArrayList;
import java.util.List;

public class BaseController {
	
	protected List<String> alunos;
	
	public BaseController() {
		alunos = new ArrayList<String>();
	}
}
