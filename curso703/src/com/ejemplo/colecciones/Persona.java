package com.ejemplo.colecciones;

import org.apache.log4j.Logger;
import java.io.Serializable;

public class Persona implements Serializable, Comparable{
	private final static Logger log = Logger.getLogger("mylog");
	private int edad;
	private String nombre;
	
	
	public Persona(String nombre, int edad) {
		this.edad = edad;
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return this.nombre + " " + this.edad;
	}
	
	
	@Override
	public int compareTo(Object o) {
		Persona p_aux = (Persona)o;
		
		return this.edad-p_aux.edad;
	}	
}
