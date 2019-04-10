package modelo;

import java.util.ArrayList;

public class Club{

	//Constantes
	
	public static final int COSTO_AFILIACION = 80000;

	//Atributos
	
	private String razonSocial;
	
	private int anioFundacion;
	
	private int dineroEnCaja;
	
	private ArrayList<Deportista> deportistas;
	
	//Metodos
	
	public Club(String razonSocial, int anioFundacion){
		
		this.razonSocial = razonSocial;
		this.anioFundacion = anioFundacion;
		dineroEnCaja = 0;	
		deportistas = new ArrayList<Deportista>();
	}
	
	public int darDineroEnCaja(){
		return dineroEnCaja;
	}

	public void afiliarDeportista(String nombre, String apellido, int anioNacimiento, String tipoId, String numeroId, int sexo){
		
		Deportista d = new Deportista(nombre, apellido, anioNacimiento, tipoId, numeroId, sexo); 
		deportistas.add(d);
			
		if(d.calcularEdad() >11){
			dineroEnCaja += COSTO_AFILIACION;
		}
				
	}
	
	public String listarDeportistasRangoEdad(int edadMinima, int edadMaxima){
		String msj = "Los deportistas son: \n";
		
		for(int i= 0; i< deportistas.size(); ++i){
			
			Deportista d = deportistas.get(i);
			
			if(d.calcularEdad()>= edadMinima && d.calcularEdad()<= edadMaxima){
				msj += d.darNombre() + " " + d.darApellido() + " " +d.darAnioNacimiento()+"\n";
			}
		}
		
		return msj;
		
	}

}