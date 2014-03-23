package com.foucrazy.dao;

import java.util.List;

import com.foucrazy.model.Curso;

public interface CursosMapper {

	public List<Curso> getAll();
	public List<Curso> getAllActive();
	public Curso findByPK(Integer idCurso);
	public void create(Curso nuevoCurso);
	public void deleteByPK(Integer idCurso);
	public void delete(Curso curso);
}
