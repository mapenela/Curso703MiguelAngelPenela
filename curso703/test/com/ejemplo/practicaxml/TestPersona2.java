package com.ejemplo.practicaxml;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPersona2 {

	
	static Persona p;
	
	@Before
	public void iniciarObjeto()
	{
		 p = new Persona("Ivan", 30);
	}
	@Test
	public void testGetEdad() {
		int edad = 30;
		assertTrue(edad==p.getEdad());
	}

}
