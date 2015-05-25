package com.ejemplo.colecciones;
import org.apache.log4j.Logger;
public class Coche implements Comparable{
	
	 public enum TipoMarca {MERCEDES, FORD, NISSAN, KIA, FIAT};
	 
	 private final static Logger log = Logger.getLogger("mylog");
	 private String matricula;
	 private TipoMarca marca;
	 
	 
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public TipoMarca getMarca() {
		return marca;
	}
	public void setMarca(TipoMarca marca) {
		this.marca = marca;
	}
	public Coche(String matricula, TipoMarca marca) {
		super();
		this.matricula = matricula;
		this.marca = marca;
	}
	@Override
	public int compareTo(Object o) {
		int n_dev;
		
		Coche c = (Coche) o;
		n_dev = this.matricula.compareTo(c.matricula);
		
		return n_dev;
	}
	 
	@Override
	public String toString() {
		
		String str_dev = null;
		
		str_dev = this.matricula+" "+this.marca;
		
		return str_dev;
	}
	
	 
	 
	 

}
