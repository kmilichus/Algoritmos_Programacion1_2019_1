package modelo;

import java.util.ArrayList;

/**
 * Entidad que representa una zona geogr�fica de reclutamiento de personal
 */
public class ZonaReclutamiento {
	public final static String[] PAISES = {"COLOMBIA","VENEZUELA","ARGENTINA","BRASIL","M�XICO","CHILE"};
	
	public final static char FEMENINO = 'F';
	public final static char MASCULINO = 'M';
	
	private String pais;
	
	private ArrayList<Candidato> candidatos;
	
	public ZonaReclutamiento(String p) {
		pais = p;
		candidatos = new ArrayList<>();
	}
	
	public void agregarCandidato(String ident, String nom, String ape, char sx, double hc, double hl, double ct, double a){
		Candidato nuevo = new Candidato(ident, nom, ape, sx, hc, hl, ct, a);
		candidatos.add(nuevo);
	}
	
	public double calcularPromedioCandidatos(){
		double prom = 0;
		//TODO
		
		return prom;
	}
	
	public void filtrarPorActitud(){
		//TODO
	}
	
	public void aplicarBonificacion(){
		//TODO
	}
	
	public ArrayList<Candidato> darCandidatos(){
		return candidatos;
	}
	
	public String darPais(){
		return pais;
	}

	public void filtrarMenoresAValor(double valor) {
		//TODO	
	}
	
	public int contarCandidatosSuperanUmbral(){
		int cantidad = 0;

		for (int i = 0; i < candidatos.size(); i++) {
			if(candidatos.get(i).calcularCalificacionCandidato() > SeleccionDePersonal.UMBRAL){
				cantidad++;
			}
		}
		
		return cantidad;
	}
}
