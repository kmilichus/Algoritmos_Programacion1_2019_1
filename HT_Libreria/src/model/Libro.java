/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad Icesi (Cali - Colombia)
 * Departamento TIC - Algoritmos y programación I
 * Hoja de Trabajo Libreria - Arreglos
 * @Author: Camilo Barrios <groovy.kmilo@gmail.com>
 * @Date: 10 Marzo 2019
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package model;


public class Libro {
	
	public final static boolean NACIONAL = true;
	
	public final static boolean INTERNACIONAL = false;

	private int dia;
	
	private int mes;
	
	private int anho;
	
	private boolean esNacional;
	
	private int cantidadPaginas;
	
	private String isbn;
	
	private String nombre;
	
	private String nombreAutor;
	
	private boolean editadoUltimoAnho;

	public Libro(int dia, int mes, int anho, boolean esNacional,
			int cantidadPaginas, String isbn, String nombre,
			String nombreAutor, boolean editadoUltimoAnho) {
		
		this.dia = dia;
		this.mes = mes;
		this.anho = anho;
		this.esNacional = esNacional;
		this.cantidadPaginas = cantidadPaginas;
		this.isbn = isbn;
		this.nombre = nombre;
		this.nombreAutor = nombreAutor;
		this.editadoUltimoAnho = editadoUltimoAnho;
	}

	public int darDia() {
		return dia;
	}

	public void modificarDia(int dia) {
		this.dia = dia;
	}

	public int darMes() {
		return mes;
	}

	public void modificarMes(int mes) {
		this.mes = mes;
	}

	public int darAnho() {
		return anho;
	}

	public void modificarAnho(int anho) {
		this.anho = anho;
	}

	public boolean darEsNacional() {
		return esNacional;
	}

	public void modificarEsNacional(boolean esNacional) {
		this.esNacional = esNacional;
	}

	public int darCantidadPaginas() {
		return cantidadPaginas;
	}

	public void modificarCantidadPaginas(int cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}

	public String darIsbn() {
		return isbn;
	}

	public void modificarIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String darNombre() {
		return nombre;
	}

	public void modificarNombre(String nombre) {
		this.nombre = nombre;
	}

	public String darNombreAutor() {
		return nombreAutor;
	}


	public void modificarNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}


	public boolean darEditadoUltimoAnho() {
		return editadoUltimoAnho;
	}

	public void modificarEditadoUltimoAnho(boolean editadoUltimoAnho) {
		this.editadoUltimoAnho = editadoUltimoAnho;
	}

	
	
	
	
	
	
	
}