package com.foucrazy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foucrazy.dao.CursosDao;
import com.foucrazy.model.Curso;
import com.foucrazy.service.CursosService;

@Service(value="cursosService")
public class CursosServiceImpl implements CursosService {

	@Autowired
	CursosDao cursosDao;
	
	public List<Curso> getAll() {
		return cursosDao.getAll();
	}

	public List<Curso> getAllActive() {
		return cursosDao.getAllActive();
	}

	public void create(Curso nuevoCurso) {
		cursosDao.create(nuevoCurso);
	}

}
