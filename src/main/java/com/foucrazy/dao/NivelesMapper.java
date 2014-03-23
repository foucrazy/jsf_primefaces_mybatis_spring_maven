package com.foucrazy.dao;
import java.util.List;
import com.foucrazy.model.Nivel;

public interface NivelesMapper {

	public List<Nivel> getAll();
	public Nivel findByPK(Integer idNivel);
	
}
