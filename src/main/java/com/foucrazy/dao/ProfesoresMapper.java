package com.foucrazy.dao;

import java.util.List;

import com.foucrazy.model.Profesor;

public interface ProfesoresMapper {

	public List<Profesor> getAll();
	public Profesor findByPK(Integer idProfesor);	
	
}
