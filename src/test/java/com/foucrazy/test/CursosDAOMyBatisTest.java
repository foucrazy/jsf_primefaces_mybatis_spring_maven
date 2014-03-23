package com.foucrazy.test;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.foucrazy.dao.CursosMapper;
import com.foucrazy.model.Curso;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring/application-config.xml" })
public class CursosDAOMyBatisTest {
	
	@Autowired
	CursosMapper cursosMapper;
	
	@Test
	public void getAll() {	
		assertNotNull(cursosMapper);
		List<Curso> all  = cursosMapper.getAll();
		assertNotNull(all);
		assertTrue(all.size()>0);		
		System.out.println("Cantidad de cursos:"+all.size());
	}
	
	@Test
	public void getAllActive() {	
		assertNotNull(cursosMapper);
		List<Curso> allActive  = cursosMapper.getAllActive();
		assertNotNull(allActive);
		assertTrue(allActive.size()>0);		
		System.out.println("Cantidad de cursos activos:"+allActive.size());
	}	

	@Test
	public void getFirst(){
		assertNotNull(cursosMapper);
		Curso first = cursosMapper.findByPK(1);
		assertNotNull(first);
		assertTrue(first.idProfesor==1);
		System.out.println(first);
	}
	
	@Test
	public void insert(){
		assertNotNull(cursosMapper);
		
		List<Curso> cursosAntes  = cursosMapper.getAll();
		Curso nuevoCurso = new Curso("Test",1,1,1,false);		
		cursosMapper.create(nuevoCurso);
		
		assertTrue(cursosMapper.getAll().size()>cursosAntes.size());
		
		cursosMapper.delete(nuevoCurso);
		assertTrue(cursosMapper.getAll().size()==cursosAntes.size());		
		
	}
}
