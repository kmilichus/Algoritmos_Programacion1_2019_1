package modelo;

/**
 * Entidad que representa a una persona que aspira a ser contratada por una empresa a través de un proceso de selección
 */
public class Candidato {
	private String id;
	private String nombres;
	private String apellidos;
	private char sexo;
	private double habilidadesComunicacion;
	private double historiaLaboral;
	private double competenciaTecnica;
	private double actitud;
	
	public Candidato(String ident, String nom, String ape, char sx, double hc, double hl, double ct, double a){
		id = ident;
		nombres = nom;
		apellidos = ape;
		sexo = sx;
		habilidadesComunicacion = hc;
		historiaLaboral = hl;
		competenciaTecnica = ct;
		actitud = a;
	}
	
	public String darId() {
		return id;
	}
	
	public String darNombres() {
		return nombres;
	}
	
	public String darApellidos() {
		return apellidos;
	}
	
	public char darSexo(){
		return sexo;
	}
	
	public double darHabilidadesComunicacion() {
		return habilidadesComunicacion;
	}
	
	public double darHistoriaLaboral() {
		return historiaLaboral;
	}
	
	public double darCompetenciaTecnica() {
		return competenciaTecnica;
	}
	
	public double darActitud() {
		return actitud;
	}
	
	public void cambiarHabilidadesComunicacion(double hc){
		habilidadesComunicacion = hc;
		if(habilidadesComunicacion>5){
			habilidadesComunicacion = 5;
		}
	}
	
	public void cambiarHistoriaLaboral(double hl){
		historiaLaboral = hl;
		if(historiaLaboral>5){
			historiaLaboral = 5;
		}
	}
	
	public void cambiarCompetenciaTecnica(double ct){
		competenciaTecnica = ct;
		if(competenciaTecnica>5){
			competenciaTecnica = 5;
		}
	}
	
	public void cambiarActitud(double a){
		actitud = a;
		if(actitud>5){
			actitud = 5;
		}
	}
}
