/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad Icesi (Cali - Colombia)
 * Departamento TIC - Algoritmos y programación I
 * Hoja de Trabajo Arreglos
 * @Author: Camilo Barrios <groovy.kmilo@gmail.com>
 * @Date: 11 Marzo 2019
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package model;


public class Punto1{


public int primerEnteroPositivoFaltante(int[] numeros){
	
	int resultado = 1;
	
	boolean encontrado = false;
	
	while(!encontrado){
		
		//Tengo que ver si resultado está en el arreglo
		boolean esta = false;
		int i = 0;
		
		while(i<numeros.length && !esta){
			
			if(numeros[i]==resultado){
				esta = true;
			}		
			i++;
		}
		
		if(esta){
			resultado++;
		}else{
			encontrado = true;
		}
		
	}
	
	return resultado;
}

	


}