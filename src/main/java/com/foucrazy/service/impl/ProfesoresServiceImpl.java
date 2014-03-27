package com.foucrazy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foucrazy.dao.ProfesoresDao;
import com.foucrazy.model.Profesor;
import com.foucrazy.service.ProfesoresService;

@Service(value="profesoresService")
public class ProfesoresServiceImpl implements ProfesoresService {

	@Autowired
	ProfesoresDao profesoresDao;
	
	@Override
	public List<Profesor> getAll() {
		return profesoresDao.getAll();
	}

}
