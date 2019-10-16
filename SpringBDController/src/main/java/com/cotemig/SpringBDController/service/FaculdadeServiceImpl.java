package com.cotemig.SpringBDController.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cotemig.SpringBDController.model.Faculdade;
import com.cotemig.SpringBDController.repository.FaculdadeRepository;

@Service("faculdadeService")
public class FaculdadeServiceImpl implements FaculdadeService {
	
	@Autowired
	FaculdadeRepository faculdadeRepository; 

	@Override
	public Optional<Faculdade> getFaculdadeById(Integer id) {
		return faculdadeRepository.findById(id);
	}

	@Override
	public List<Faculdade> getAllFaculdades() {
		return faculdadeRepository.findAll();
	}

	@Override
	public void deleteAllFaculdades() {
		faculdadeRepository.deleteAll();
	}

	@Override
	public void deleteFaculdadeById(Integer id) {
		faculdadeRepository.deleteById(id);
	}

	@Override
	public void updateFaculdadeById(Integer id, Faculdade faculdade) {
		
		Optional<Faculdade> getFaculdade = getFaculdadeById(id);
		getFaculdade.get().setName(faculdade.getName());
		
		faculdadeRepository.save(faculdade);
	}
	
	@Override
	public void updateFaculdade(Faculdade faculdade) {
		faculdadeRepository.save(faculdade);
	}

	@Override
	public void insertFaculdade(Faculdade faculdade) {
		faculdadeRepository.save(faculdade);
	}
}
