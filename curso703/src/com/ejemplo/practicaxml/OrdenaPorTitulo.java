package com.ejemplo.practicaxml;
import java.util.Comparator;

public class OrdenaPorTitulo implements Comparator<Libro>{
	
	@Override
	public int compare(Libro p1, Libro p2) {
		// TODO Auto-generated method stub
		//devuelve el mismo entero si multi
		return p1.getTitulo().compareTo(p2.getTitulo());
	}
}
