package com.ejemplo.practicaxml;
import static org.junit.Assert.*;
import static com.ejemplo.practicaxml.*;
import javax.xml.ws.BindingType;
import static org.hamcrest.core.Is.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;


public class TestPersona {
	Persona p = null;
	@Before
	public void initPersona ()
	{
		p = new Persona("Juan", 32);
	}
	
@Test
public void testGetEdad() {
	assertEquals(32, p.getEdad());
	assertThat(p.getEdad(), is(32));
}
}