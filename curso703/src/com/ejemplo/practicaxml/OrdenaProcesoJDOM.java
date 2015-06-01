package com.ejemplo.practicaxml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class OrdenaProcesoJDOM {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException,
	JDOMException, IOException  {
		// TODO Auto-generated method stub
		//CREAMOS EL PARSER
		SAXBuilder builder = new SAXBuilder();
		// Construimos el arbol DOM a partir del fichero xml
		Document documentJDOM = builder.build(new FileInputStream("libros.xml"));
		//HACER ArrayList<libro>
		Element raiz = documentJDOM.getRootElement();
		

		/// aqui añadir los datos del libro al array LIST que será ordenado.
		ArrayList<Libro> libroscopia=new ArrayList<Libro>();
		
		// Recorremos los hijos de la etiqueta raíz
		List<Element> libros = raiz.getChildren();		
		String intermedio = "";			
		for (Element libro : libros) {
			Libro book = new Libro();
			List<Element> detalles = libro.getChildren();
            String isbn = libro.getAttribute("isbn").getValue();
            book.setIsbn(isbn);            
			for (Element detalle : detalles) {
				intermedio=detalle.getName();
				if (intermedio == "titulo") {
                    book.setTitulo(detalle.getValue());                    
				}
				if (intermedio == "autor") {
                    book.setAutor(detalle.getValue());                    
				}
				if (intermedio == "anyo") {
                    book.setAnyo(detalle.getValue());                    
				}
				if (intermedio == "editorial") {
                    book.setEditorial(detalle.getValue());                    
				}
			}
			libroscopia.add(book);
	    }
		// ordenar el array list por titulo
		Collections.sort(libroscopia, new OrdenaPorTitulo());		
		
		//GENERO NUEVO DOCUMENTO
		
		// RECORRER EL ARRAY LIST libroscopia Y TRATAR LIBRO A LIBRO
		
		Element padre = documentJDOM.getRootElement();
		Element e_raiz = new Element("libros");				
		padre.addContent(e_raiz);		
		
		for (int x=0;x<libroscopia.size();x++) {
			Libro unlibro = libroscopia.get(x);
			//System.out.println(unlibro);						
				Element nuevolibro = new Element("libro");  
							
					//aqui trato el isbn				    
				    // Añadimos un atributo				    
					nuevolibro.setAttribute("isbn",unlibro.getIsbn()); 					
					padre.addContent(nuevolibro);  
				
				
					//aqui trato el titulo					
					Element titulo = new Element("titulo");
					titulo.addContent(unlibro.getTitulo());
					nuevolibro.addContent(titulo);
					padre.addContent(nuevolibro); 
				
				
					//aqui trato el autor
					Element autor = new Element("autor");
					autor.addContent(unlibro.getAutor());
					nuevolibro.addContent(autor);
					padre.addContent(nuevolibro); 
				
				
					//aqui trato el año
					Element anyo = new Element("anyo");
					anyo.addContent(unlibro.getAnyo());
					nuevolibro.addContent(anyo);
					padre.addContent(nuevolibro); 
				
				
					//aqui trato el editorial
					Element editorial = new Element("editorial");
					editorial.addContent(unlibro.getEditorial());
					nuevolibro.addContent(editorial);
					
					//e_raiz.addContent(nuevolibro);
					padre.addContent(nuevolibro); 										
		}
		System.out.println(padre);
	    // Creamos una nueva etiqueta  
	    //Element nuevolibro = new Element("libro");  
	    // Añadimos un atributo
	    
		//nuevolibro.setAttribute("isbn", ""); 
		
		//padre.addContent(nuevolibro);  
		//Element titulo = new Element("titulo");
		//titulo.addContent("Lo que el viento se llevó");
		//nuevolibro.addContent(titulo);
}
}
