/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad Icesi (Cali - Colombia)
 * Departamento TIC - Algoritmos y programación I
 * Seguimiento Semana 7
 * @Author: Camilo Barrios <groovy.kmilo@gmail.com>
 * @Date: 8 Marzo 2019
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package model;

public class Exercise {


	public String calcularNotaDefinitiva(int[] valoresPonderados, double[] notas){
		String mensaje = "La nota definitiva es ";

		if(valoresPonderados.length == notas.length){

			double notaFinal = 0;
			boolean notasOK = true;
			boolean valoresPonderadosOK = true;

			for (int i = 0; i < notas.length && notasOK && valoresPonderadosOK; i++) {

				notaFinal += (valoresPonderados[i]*notas[i]) / 100.0;

				if(valoresPonderados[i]<0 || valoresPonderados[i]>100){
					valoresPonderadosOK = false;
					mensaje = "Los valores de los rangos deben estar entre 0 y 100";
				}
				
				if(notas[i]<0.0 || notas[i]>5.0){
					notasOK = false;
					mensaje = "Las notas deben ser valores entre 0.0 y 5.0";
				}
			}
			
			if(notasOK && valoresPonderadosOK){
				mensaje += notaFinal;
			}

		}else {
			mensaje = "Los dos arreglos deben tener el mismo número de elementos";
		}


		return mensaje;
	}


}
