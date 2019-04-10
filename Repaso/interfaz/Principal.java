package interfaz;

import modelo.*;
import java.util.Scanner;

public class Principal{

	
	public static void main(String[] args){
		
		Club c = new Club("Tiburones del Valle", 1979);
		
		c.afiliarDeportista("Jhon", "zeta", 2002, Deportista.CC, "10101010", Deportista.MASCULINO);
		c.afiliarDeportista("Pedro", "A", 2010, Deportista.TI, "247467", Deportista.MASCULINO);
		c.afiliarDeportista("Maria", "W", 1940, Deportista.CC, "3473567", Deportista.FEMENINO);
		
		System.out.println("El dinero en caja es: " + c.darDineroEnCaja());
		System.out.println(c.listarDeportistasRangoEdad(5, 20));
	
	
	
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Por favor digite el nombre del deportista");
		String nombre = lector.nextLine();
		
		System.out.println("Por favor digite el apellido del deportista");
		String apellido = lector.nextLine();
		
		System.out.println("Por favor digite el anioNacimiento del deportista");
		int anioNacimiento = lector.nextInt();
		lector.nextLine();
		
		System.out.println("Por favor digite el tipo de identificacion del deportista");
		System.out.println("1. Cedula Ciudadania");
		System.out.println("2. Cedula Extranjeria");
		System.out.println("3. Tarjeta identidad");
		System.out.println("4. Pasaporte");
		
		int seleccion = lector.nextInt();
		lector.nextLine();
		String tipoId = Deportista.CC;
		
		switch (seleccion){
			
			case 1:
				tipoId = Deportista.CC;
			break; 
			
			case 2:
				tipoId = Deportista.CE;
			break;
			
			case 3:
				tipoId = Deportista.TI;
			break;
			
			case 4:
				tipoId = Deportista.PAS;
			break;
			
		}
		
		System.out.println("Por favor digite el numero de identificacion");
		String numId = lector.nextLine();
		
		
		System.out.println("Por favor digite el sexo del deportista");
		System.out.println("1. MASCULINO");
		System.out.println("2. FEMENINO");
		
		int seleccion2 = lector.nextInt();
		lector.nextLine();
		int sexo = 0;
		
		if(seleccion2 ==1){
			sexo = Deportista.MASCULINO;
		}else if (seleccion2 == 2){
			sexo = Deportista.FEMENINO;
		}else{
		System.out.println("Aprenda a usar el programa.");

		}
		
		c.afiliarDeportista(nombre, apellido, anioNacimiento, tipoId, numId, sexo);

		System.out.println("El dinero en caja es: " + c.darDineroEnCaja());
		System.out.println(c.listarDeportistasRangoEdad(5, 20));
		
		

		
	}


}
