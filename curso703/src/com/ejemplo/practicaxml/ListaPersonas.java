package com.ejemplo.practicaxml;

import com.ejemplo.practicaxml.InsertarPersonaException;

public class ListaPersonas {
	
	public static final int CAPACIDAD = 10;
	
	private Persona[] array_personas;
	
	/**
	 * Es muy posible que haga falta a�adir alg�n campo m�s
	 */
	
	public ListaPersonas()
	{
		//TODO HAY QUE HACER UN CONSTRUCTOR
		//RECUERDA QUE EL CONSTRUCTOR SIRVE PARA
			//RESERVAR MEMORIA
			//INICIALIZAR EL ESTADO DEL OBJETO Y SUS ATRIBUTOS
	}
	
	public Persona[] getListaPersonas ()
	{
		//TODO HAY QUE DEVOLVER EL ARRAY DE PERSONAS QUE CONFORMAN LA LISTA
		return null;
	}
	
	public Persona buscarPersona (String nombre)
	{
		//TODO BUSCAR PERSONA POR NOMBRE Y DEVOLVERLA
		//SI NO EST�, DEVOLVER NULO
		return null;
	}
	
	public Persona busarPersona (int edad)
	{
		//TODO BUSCAR PERSONA POR EDAD Y DEVOLVERLA
		//SI NO EST�, DEVOLVER NULO
		return null;
	}
	
	public boolean serializar ()
	{
		//Hacer uso del fichero de propiedades serializa.properties, 
		//para obtener de �l el valor de la clave destino, 
		//que representa el nombre del fichero de salida
		return false;
	}
	
	public boolean deserializar()
	{
		return false;
	}
	
	public void insertarPersona (Persona p) throws InsertarPersonaException
	{
	}
	
	public int numeroPersonas()
	{
		return 0;
	}
	
	public boolean estaLlena()
	{
		return false;
	}
	
	public void mostrar()
	{
		//TODO MOSTRAR LA LISTA DE PERSONAS
		// pista: ayudarse del m�todo toString de persona
	}

}
