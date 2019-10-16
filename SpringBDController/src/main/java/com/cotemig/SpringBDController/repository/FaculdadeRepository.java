package com.cotemig.SpringBDController.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cotemig.SpringBDController.model.Faculdade;

@Repository("faculdadeRepository")
public interface FaculdadeRepository extends JpaRepository<Faculdade, Integer> {

}
