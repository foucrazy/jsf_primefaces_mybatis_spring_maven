package com.foucrazy.service;

import java.util.List;

import com.foucrazy.model.Curso;

public interface CursosService {

	public List<Curso> getAll();
	public List<Curso> getAllActive();
	public void create(Curso nuevoCurso);
	
}
