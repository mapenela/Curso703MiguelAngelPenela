package com.ejemplo.practicaxml;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Testlistapersonas {

	@Test
	public void testListaPersonas() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetListaPersonas() {
		ArrayList<Persona> persona=new ArrayList<Persona>();		
		persona.add(new Persona("Carlos",20));
		persona.add(new Persona("Ricardo", 15));
		persona.add(new Persona("Sebastian", 19));		
		assertNotNull(persona);
	}



}
