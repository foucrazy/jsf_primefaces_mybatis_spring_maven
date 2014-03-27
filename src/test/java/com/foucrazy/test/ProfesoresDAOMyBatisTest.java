package com.foucrazy.test;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.foucrazy.dao.ProfesoresDao;
import com.foucrazy.model.Profesor;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring/application-config.xml" })
public class ProfesoresDAOMyBatisTest {
	
	@Autowired
	ProfesoresDao profesoresDao;
	
	@Test
	public void getAll() {	
		assertNotNull(profesoresDao);
		List<Profesor> all  = profesoresDao.getAll();
		assertNotNull(all);
		assertTrue(all.size()>0);		
		System.out.println("Cantidad de profesores:"+all.size());
	}

	@Test
	public void getFirst(){
		assertNotNull(profesoresDao);
		Profesor first = profesoresDao.findByPK(1);
		assertNotNull(first);
		assertTrue(first.getIdProfesor()==1);
		System.out.println(first);
	}
}
