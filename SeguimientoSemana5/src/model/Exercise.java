/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad Icesi (Cali - Colombia)
 * Departamento TIC - Algoritmos y programación I
 * Seguimiento Semana 5
 * @Author: Camilo Barrios <groovy.kmilo@gmail.com>
 * @Date: 22 Febrero 2019
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package model;

public class Exercise {


	public final static String CARTULINA = "cartu";
	public final static String PAPEL_COLORES = "papel";
	public final static String FOMI= "fomi";


	public double calcularPrecioMaceta(int cantidad, String tipoAdorno, boolean domicilio){

		double precio = 0.0;
		double valorUnitario =  0;
		double valorAdorno = 0;

		if(cantidad>=5 && cantidad<=8){
			valorUnitario =  100;
		} else if (cantidad>=9 && cantidad<=14){
			valorUnitario =  90;
		}else if (cantidad>=15 && cantidad<=17){
			valorUnitario =  80;
		}else{
			valorUnitario =  65;
		}


		if(tipoAdorno.equals(CARTULINA)){
			valorAdorno = 500;
		}else if (tipoAdorno.equals(PAPEL_COLORES)){
			valorAdorno = 1000;
		}else{
			valorAdorno = 2000;
		}

		precio = (cantidad * valorUnitario) + valorAdorno;

		if(domicilio){
			double valorDomicilio = precio * 0.1;
			precio += valorDomicilio;
		}

		return precio;

	}

}
