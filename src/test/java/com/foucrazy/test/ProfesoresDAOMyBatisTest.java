package com.foucrazy.test;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.foucrazy.dao.ProfesoresMapper;
import com.foucrazy.model.Profesor;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring/application-config.xml" })
public class ProfesoresDAOMyBatisTest {
	
	@Autowired
	ProfesoresMapper profesoresMapper;
	
	@Test
	public void getAll() {	
		assertNotNull(profesoresMapper);
		List<Profesor> all  = profesoresMapper.getAll();
		assertNotNull(all);
		assertTrue(all.size()>0);		
		System.out.println("Cantidad de profesores:"+all.size());
	}

	@Test
	public void getFirst(){
		assertNotNull(profesoresMapper);
		Profesor first = profesoresMapper.findByPK(1);
		assertNotNull(first);
		assertTrue(first.idProfesor==1);
		System.out.println(first);
	}
}
