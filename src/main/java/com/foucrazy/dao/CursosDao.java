package com.foucrazy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.foucrazy.model.Curso;

@Repository
public interface CursosDao {

	public List<Curso> getAll();
	public List<Curso> getAllActive();
	public Curso findByPK(Integer idCurso);
	public void create(Curso nuevoCurso);
	public void deleteByPK(Integer idCurso);
	public void delete(Curso curso);
}
