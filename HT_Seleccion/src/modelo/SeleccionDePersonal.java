package modelo;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * Entidad que representa la secci�n de recursos humanos encargado de hacer la selecci�n de personal
 */
public class SeleccionDePersonal {
	public final static int MAX_ZONAS = ZonaReclutamiento.PAISES.length;
	
	public final static double PESO_COMUNICACION=0.30;
	public final static double PESO_LABORAL=0.15;
	public final static double PESO_TECNICA=0.35;
	public final static double PESO_ACTITUD=0.2;
	
	public final static double UMBRAL = 3.5;
	
	private ZonaReclutamiento[] zonasRecluta;
	
	public SeleccionDePersonal(){
		zonasRecluta = new ZonaReclutamiento[MAX_ZONAS]; 
	}
	
	public void agregarNuevaZona(int k, String nombrePais){
		zonasRecluta[k] = new ZonaReclutamiento(nombrePais);
	}
	
	public void agregarCandidato(int k, String ident, String nom, String ape, char sx, double hc, double hl, double ct, double a){
		zonasRecluta[k].agregarCandidato(ident, nom, ape, sx, hc, hl, ct, a);
	}
	
	
	public double calcularCalificacionCandidato(Candidato cand){
		//TODO
		return 0;
	}
	
	public int contarCandidatosSuperanUmbral(ZonaReclutamiento zr){
		//TODO
		
		return 0;
	}
	
	public String encontrarZonaConMasCandidatosSuperanUmbral(){
		//TODO
		
		ZonaReclutamiento zr = zonasRecluta[0];
		
		for(int i = 1; i< zonasRecluta.length; i++){
			
			if(zonasRecluta[i].contarCandidatosSuperanUmbral() > zr.contarCandidatosSuperanUmbral()){
				zr = zonasRecluta[i];
			}
		}
		
		return "La zona de reclutamiento con mayor candidatos que superan el Umbral es "+zr.darPais() + " con "+zr.contarCandidatosSuperanUmbral() ;
	}
	
	public double calcularPorcentajeTotalMujeres(){
		//TODO
		return 0;
	}
	
	public int calcularTotalCandidatos(){
		//TODO
		return 0;
	}
	
	public double calcularPromedioTotalCandidatos(){
		//TODO
		return 0;
	}
	
	public String hacerFiltradoEspecial(){
		
		//TODO
		return "Para implementar";
	}
	
	public ZonaReclutamiento[] darZonaReclutamientos(){
		return zonasRecluta;
		
	}
}
