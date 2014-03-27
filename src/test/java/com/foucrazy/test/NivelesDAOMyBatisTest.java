package com.foucrazy.test;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.foucrazy.dao.NivelesDao;
import com.foucrazy.model.Nivel;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring/application-config.xml" })
public class NivelesDAOMyBatisTest {
	
	@Autowired
	NivelesDao nivelesDao;
	
	@Test
	public void getAll() {	
		assertNotNull(nivelesDao);
		List<Nivel> all  = nivelesDao.getAll();
		assertNotNull(all);
		assertTrue(all.size()>0);		
		System.out.println("Cantidad de niveles:"+all.size());
	}

	@Test
	public void getFirst(){
		assertNotNull(nivelesDao);
		Nivel first = nivelesDao.findByPK(1);
		assertNotNull(first);
		assertTrue(first.getIdNivel()==1);
		System.out.println(first);
	}
}
