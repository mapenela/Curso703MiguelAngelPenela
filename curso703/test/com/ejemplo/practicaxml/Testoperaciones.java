package com.ejemplo.practicaxml;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testoperaciones {
    static Operaciones tester;
    
    @BeforeClass
    public static void iniciaClase()
    {
    	tester = new Operaciones();
    }
    @AfterClass 
    public static void finalizaClase()
    { 
    	tester = null;
    }
	@Test
	public void testSuma() {
		assertEquals("5MAS3=8",8,tester.suma(5, 3));
	}

	@Test
	public void testMultiplicacion() {
		assertEquals("5POR3=15",15,tester.multiplicacion(5, 3));
	}

	@Test
	public void testDivision() {
		assertEquals("5/3=1",1,tester.division(5, 3));
	}

	@Test
	public void testResta() {
		assertEquals("5-3=2",2,tester.resta(5, 3));
	}

}
