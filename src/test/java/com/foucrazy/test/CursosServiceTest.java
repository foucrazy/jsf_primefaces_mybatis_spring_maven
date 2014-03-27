package com.foucrazy.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.foucrazy.model.Curso;
import com.foucrazy.service.CursosService;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring/application-config.xml" })
public class CursosServiceTest {
	
	@Autowired
	public CursosService cursosService;
	
	@Test
	public void getAllAcive(){
		assertNotNull(cursosService);
		List<Curso> allActive  = cursosService.getAllActive();
		assertNotNull(allActive);		
	}

}
