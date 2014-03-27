package com.foucrazy.test;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.foucrazy.dao.CursosDao;
import com.foucrazy.model.Curso;
import com.foucrazy.model.Nivel;
import com.foucrazy.model.Profesor;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring/application-config.xml" })
public class CursosDAOMyBatisTest {
	
	@Autowired
	CursosDao cursosDao;
	
	@Test
	public void getAll() {	
		assertNotNull(cursosDao);
		List<Curso> all  = cursosDao.getAll();
		assertNotNull(all);
		assertTrue(all.size()>0);		
		System.out.println("Cantidad de cursos:"+all.size());
	}
	
	@Test
	public void getAllActive() {	
		assertNotNull(cursosDao);
		List<Curso> allActive  = cursosDao.getAllActive();
		assertNotNull(allActive);
		assertTrue(allActive.size()>0);		
		System.out.println("Cantidad de cursos activos:"+allActive.size());
	}	

	@Test
	public void getFirst(){
		assertNotNull(cursosDao);
		Curso first = cursosDao.findByPK(1);
		assertNotNull(first);
		assertTrue(first.getIdCurso()==1);
		System.out.println(first);
	}
	
	@Test
	public void insert(){
		assertNotNull(cursosDao);
		
		List<Curso> cursosAntes  = cursosDao.getAll();
		Nivel nivel = new Nivel(1);
		Profesor profesor = new Profesor(1);
		Curso nuevoCurso = new Curso("Test",1,nivel,profesor,false,"");		
		cursosDao.create(nuevoCurso);
		
		assertTrue(cursosDao.getAll().size()>cursosAntes.size());
		
		cursosDao.delete(nuevoCurso);
		assertTrue(cursosDao.getAll().size()==cursosAntes.size());		
		
	}
}
