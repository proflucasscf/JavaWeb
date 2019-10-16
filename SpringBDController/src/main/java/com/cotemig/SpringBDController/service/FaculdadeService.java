package com.cotemig.SpringBDController.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.SpringBDController.model.Faculdade;

public interface FaculdadeService {
	Optional<Faculdade> getFaculdadeById(Integer id);
	List<Faculdade> getAllFaculdades();
	void deleteAllFaculdades();
	void deleteFaculdadeById(Integer id);
	void updateFaculdadeById(Integer id, Faculdade faculdade);
	void updateFaculdade(Faculdade faculdade);
	void insertFaculdade(Faculdade faculdade);
}
