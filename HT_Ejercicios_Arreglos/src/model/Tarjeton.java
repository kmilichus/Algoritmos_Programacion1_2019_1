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

public class Tarjeton{

	public static final String POR_CANDIDATO = "val";
	public static final String INVALIDO = "inva";
	public static final String VOTO_EN_BLANCO = "blanco";
	
	private String cedulaVotante;
	
	private int numeroTarjeton;
	
	private boolean[] candidatos;
	
	
	//Metodos

	public String darTipoTarjeton(){
		
		String tipo = "";	
		int totalMarcados = 0;	
		for(int i = 0; i<candidatos.length && totalMarcados<2; i++){		
				if(candidatos[i]){
					totalMarcados++;
				}
		}
		
		if(totalMarcados == 1){
			//Es valido
			if(candidatos[ candidatos.length - 1 ]){
				tipo = VOTO_EN_BLANCO;
			}else{
				tipo = POR_CANDIDATO;
			}
			
		}else{
			tipo = INVALIDO;
		}
		return tipo;
	}


}