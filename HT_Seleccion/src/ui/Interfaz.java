/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad Icesi (Cali - Colombia)
 * Departamento TIC - Algoritmos y programación I
 * HT - Seleccion Personal
 * @Author: Camilo Barrios <groovy.kmilo@gmail.com>
 * @Date: 17 Marzo 2019
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package ui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.*;

public class Interfaz{

	//Atributos
	
	private SeleccionDePersonal miSeleccionDePersonal;

	private Scanner lector;
	
	//Metodos
	
	public Interfaz() {
		init();	
	}


	private void init() {
		miSeleccionDePersonal = new SeleccionDePersonal();
		cargarCandidatos();	
		lector = new Scanner(System.in);
	}





	private void menu() {
	


		int valor = 0;


		while (valor != 7) {

			System.out.println("Por favor digite la opcion que desea revisar: ");
			System.out.println("1.  Para ver la información de los Candidatos");
			System.out.println("2.  Para ver la zona con más candidatos en el umbral");
			System.out.println("3.  Para ver el total de candidatos");
			System.out.println("4.  Para ver el promedio total");
			System.out.println("5.  Para ver el porcentaje total de mujeres");
			System.out.println("6.  Para ver un filtrado especial");
			System.out.println("7.  Para Salir");



			valor = lector.nextInt();
			lector.nextLine();


			switch (valor) {
			case 1:
				MostrarTablaColaboradores();
				break;
				
			case 2:
				gestionarZonaMasCandidatosUmbral();
				break;
				
			case 3:
				gestionarTotalCandidatos();
				break;
				
			case 4:
				gestionarPromedioTotal();
				break;
				
			case 5:
				gestionarPorcentajeTotalMujeres();
				break;
							
			case 6:
				gestionarFiltradoEspecial();
				break;

			case 7:
				System.out.println("Gracias por usar nuestro programa!");
				break;
			default:
				System.out.println("Digita una opción válida");
				break;

			}

			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {

			}

		}

		System.exit(0);


	}





	public void mostrarBanner() {
		StringBuilder all = new StringBuilder();
		all.append("\n");
		int ancho = 17;
		for (int a = 1; a <= 4; a++) {
			int cantidadAsteriscos = ancho - a;
			int cantidadEspacios = ancho - cantidadAsteriscos;
			int cantidadSlashes = (ancho - a) * 2;
			int cantidadDeBackSlashes = (a - 1) * 2;
			pegarCaracteres(all, '*', cantidadAsteriscos);
			pegarCaracteres(all, ' ', cantidadEspacios);
			pegarCaracteres(all, '/', cantidadSlashes);
			pegarCaracteres(all, '\\', cantidadDeBackSlashes);
			pegarCaracteres(all, ' ', cantidadEspacios);
			pegarCaracteres(all, '*', cantidadAsteriscos);
			all.append("\n");
		}

		all.append("******************************************************************\n");
		all.append("*** BIENVENIDO AL SOFTWARE DE PROCESO DE SELECCION DE PERSONAL ***\n");
		all.append("******************************************************************\n");

		for (int a = 4; a >= 1; a--) {
			int cantidadAsteriscos = ancho - a;
			int cantidadEspacios = ancho - cantidadAsteriscos;
			int cantidadDeBackSlashes = (ancho - a) * 2;
			int cantidadSlashes = (a - 1) * 2;
			pegarCaracteres(all, '*', cantidadAsteriscos);
			pegarCaracteres(all, ' ', cantidadEspacios);
			pegarCaracteres(all, '/', cantidadSlashes);
			pegarCaracteres(all, '\\', cantidadDeBackSlashes);
			pegarCaracteres(all, ' ', cantidadEspacios);
			pegarCaracteres(all, '*', cantidadAsteriscos);
			all.append("\n");
		}
		all.append("\n");
		System.out.println(all.toString());
	}

	static void pegarCaracteres(StringBuilder sb, char c, int count) {
		for(int i = 0; i < count; i++) {
			sb.append(c);
		}
	}

	public void gestionarZonaMasCandidatosUmbral(){
		String reporte = miSeleccionDePersonal.encontrarZonaConMasCandidatosSuperanUmbral();
		System.out.println(reporte);
	}

	public void gestionarPorcentajeTotalMujeres(){
		double porcMuj = miSeleccionDePersonal.calcularPorcentajeTotalMujeres();
		DecimalFormat df = new DecimalFormat("0.##");
		System.out.println("El % total de mujeres es: " + df.format(porcMuj));
	}

	public void gestionarFiltradoEspecial(){
		String reporte = miSeleccionDePersonal.hacerFiltradoEspecial();
		System.out.println(reporte);
		MostrarTablaColaboradores();
	}

	public void gestionarTotalCandidatos() {
		int totalC = miSeleccionDePersonal.calcularTotalCandidatos();
		System.out.println("El total de candidatos son: " +totalC);
	}

	public void gestionarPromedioTotal() {
		DecimalFormat df = new DecimalFormat("0.##");
		double promT = miSeleccionDePersonal.calcularPromedioTotalCandidatos();
		System.out.println("El promedio total  de los candidatos es: " + df.format(promT));
	}

	private void MostrarTablaColaboradores() {

		ZonaReclutamiento[] zr = miSeleccionDePersonal.darZonaReclutamientos();
		for (int i = 0; i < zr.length; i++) {
			agregarTabla(zr[i].darPais(),zr[i].darCandidatos());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
		}


	}


	private void agregarTabla(String pais, ArrayList<Candidato> candidatos) {

		String formato = "|%-11s| %-20s | %-20s | %-5s | %-5s | %-5s | %-5s | %-5s | %n";
		String formato2 = "%-35s %-10s  %-35s  %n";

		String l = "-------------------------------------------";
		System.out.format(formato2, l,pais,l);
		System.out.format("+-----------+----------------------+----------------------+-------+-------+-------+-------+-------+%n");
		System.out.format(formato, "ID", "Apellidos" ,"Nombres", "Sexo", "Comu", "Labo" , "Técni" , "Acti");
		System.out.format("+-----------+----------------------+----------------------+-------+-------+-------+-------+-------+%n");		
		DecimalFormat df = new DecimalFormat("0.###");

		for (int i = 0; i < candidatos.size(); i++) {
			Candidato c = candidatos.get(i);
			System.out.format(formato, c.darId(),c.darApellidos(),c.darNombres(),c.darSexo(), df.format(c.darHabilidadesComunicacion()),
					df.format(c.darHistoriaLaboral()),
					df.format(c.darCompetenciaTecnica()),
					df.format(c.darActitud()));
		}
		System.out.format("+-----------+----------------------+----------------------+-------+-------+-------+-------+-------+%n%n%n");		


	}




	private void cargarCandidatos(){
		try {
			BufferedReader br = new BufferedReader(new FileReader("data/txt/candidates"));
			String linea = br.readLine();
			String zonaAnterior = "";
			int k = -1;
			while(linea!=null){
				String[] campos = linea.split("\t");
				if(!zonaAnterior.equals(campos[0])){
					zonaAnterior = campos[0];
					k++;
					miSeleccionDePersonal.agregarNuevaZona(k, campos[0]);
				}			
				miSeleccionDePersonal.agregarCandidato(k, campos[1], campos[2], campos[3], campos[4].charAt(0), 
						Double.parseDouble(campos[5]), Double.parseDouble(campos[6]), 
						Double.parseDouble(campos[7]), Double.parseDouble(campos[8]));
				
				linea = br.readLine();
			}
			br.close();
			
		} catch (Exception e) {
			System.out.println("Error cargando los datos");
		}
	}

	public static void main(String[] args) throws IOException{
		Interfaz ipsl = new Interfaz();
		ipsl.mostrarBanner();
		ipsl.menu();
	}
}
