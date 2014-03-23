package com.foucrazy.test;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.foucrazy.dao.NivelesMapper;
import com.foucrazy.model.Nivel;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring/application-config.xml" })
public class NivelesDAOMyBatisTest {
	
	@Autowired
	NivelesMapper nivelesMapper;
	
	@Test
	public void getAll() {	
		assertNotNull(nivelesMapper);
		List<Nivel> all  = nivelesMapper.getAll();
		assertNotNull(all);
		assertTrue(all.size()>0);		
		System.out.println("Cantidad de niveles:"+all.size());
	}

}
