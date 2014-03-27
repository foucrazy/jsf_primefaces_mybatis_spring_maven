package com.foucrazy.service;

import java.util.List;

import com.foucrazy.model.Nivel;

public interface NivelesService {
	
	public List<Nivel> getAll();
	public Nivel findByPk(Integer idNivel);

}
