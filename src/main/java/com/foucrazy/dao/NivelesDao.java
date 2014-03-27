package com.foucrazy.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.foucrazy.model.Nivel;

@Repository
public interface NivelesDao {

	public List<Nivel> getAll();
	public Nivel findByPK(Integer idNivel);
	
}
