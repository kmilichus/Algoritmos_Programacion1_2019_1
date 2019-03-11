/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad Icesi (Cali - Colombia)
 * Departamento TIC - Algoritmos y programaci�n I
 * Hoja de Trabajo Libreria - Arreglos
 * @Author: Camilo Barrios <groovy.kmilo@gmail.com>
 * @Date: 10 Marzo 2019
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package ui;

import model.*;

public class Main {
	
	private Libreria libreria;
	
	
	public Main() {
		libreria = new Libreria("Biblioteca Departamental Jorge Garcés Borrero", " Calle 5 No 24A – 91", "760043174");
		agregarLibros();
			
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		
	}
	
	public void agregarLibros() {
		
		libreria.agregarLibro(1, 1, 1605, Libro.INTERNACIONAL, 554, "9788474641288", "Don Quijote de la Mancha", "Miguel de Cervantes", false);
		
	}

}
