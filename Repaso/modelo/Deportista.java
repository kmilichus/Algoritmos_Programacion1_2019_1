package modelo;

public class Deportista{

	//Constantes
	
	public static final String TI = "Tarjeta de Identidad";
	
	public static final String CC = "Cedula ciudadania";

	public static final String CE = "Cedula de extranjeria";
	
	public static final String PAS = "Pasaporte";

	public static final int FEMENINO = 1;
	
	public static final int MASCULINO = 2;

	// Atributos
	
	private String nombre;
	
	private String apellido;
	
	private int anioNacimiento;
	
	private String tipoId;
	
	private String numeroId;
	
	private int sexo;
	
	//Metodos
	
	public Deportista(String nombre, String apellido, int anioNacimiento, String tipoId, String numeroId, int sexo){
		
		this.nombre = nombre;
		this.apellido = apellido; 
		this.anioNacimiento = anioNacimiento;
		this.tipoId = tipoId;
		this.numeroId = numeroId;
		this.sexo = sexo;
		
	}
	
	public String darNombre(){
		return nombre;
	}
	
	public String darApellido(){
		return apellido;
	}
	
	public int darAnioNacimiento(){
		return anioNacimiento;
	}
	
	public int calcularEdad(){
		return 2019 - anioNacimiento;
	}


}