/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad Icesi (Cali - Colombia)
 * Departamento TIC - Algoritmos y programación I
 * Hoja de Trabajo Arreglos
 * @Author: Camilo Barrios <groovy.kmilo@gmail.com>
 * @Date: 13 Marzo 2019
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package model;

public class PuestoVotacion{

	public static final int CANTIDAD_TARJETONES = 300;
	
	private Tarjeton[] tarjetones;
	
	
	public int[] contarVotos(){
		int[] votos = new int[3];
		
		for(int i = 0; i<CANTIDAD_TARJETONES; i++){
			
			if(tarjetones[i]!=null){
				
				if(tarjetones[i].darTipoTarjeton().equals(Tarjeton.POR_CANDIDATO)){
					votos[0]++;
				}else if (tarjetones[i].darTipoTarjeton().equals(Tarjeton.INVALIDO)){
					votos[1]++;
				}else{
					votos[2]++;
				}
				
			}
			
		}
		
		return votos;
	}

}