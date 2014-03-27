package com.foucrazy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foucrazy.dao.NivelesDao;
import com.foucrazy.model.Nivel;
import com.foucrazy.service.NivelesService;

@Service(value="nivelesService")
public class NivelesServiceImpl implements NivelesService{

	@Autowired
	NivelesDao nivelesDao;
	
	@Override
	public List<Nivel> getAll() {
		return nivelesDao.getAll();
	}

	@Override
	public Nivel findByPk(Integer idNivel) {
		return nivelesDao.findByPK(idNivel);
	}

}
