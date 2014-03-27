package com.foucrazy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.foucrazy.model.Profesor;

@Repository
public interface ProfesoresDao {

	public List<Profesor> getAll();
	public Profesor findByPK(Integer idProfesor);	
	
}
