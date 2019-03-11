/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad Icesi (Cali - Colombia)
 * Departamento TIC - Algoritmos y programación I
 * Seguimiento Semana 6
 * @Author: Camilo Barrios <groovy.kmilo@gmail.com>
 * @Date: 1 Marzo 2019
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */


package ui;

import model.*;


public class Main {
	
	private QualifyingSession formula1;
	
	public Main() {
		init();
	}
	
	private void init() {
	
		
		// Mercedes
		RaceCar car1 = new RaceCar("Lewis Hamiltion", new Time(1, 26, 469));
		car1.setLap2Time(new Time(1, 26, 846));
		RaceCar car2 = new RaceCar("Valtteri Bottas", new Time(1, 26, 444));
		car2.setLap2Time(new Time(1, 27, 010));
		car2.setLap3Time(new Time(1, 26, 500));
		RaceCar car3 = null;	
		Team mercedes = new Team("Mercedes-AMG Petronas Motorsport", car1, car2);
		
		//Ferrari
		car1 = new RaceCar("Sebastian Vettel", new Time(1, 26, 877));
		car1.setLap2Time(new Time(1, 26, 373));
		car1.setLap3Time(new Time(1, 26, 370));
		car2 = new RaceCar("Charles Leclerc", new Time(1, 26, 978));
		car2.setLap2Time(new Time(1, 26, 880));
		car2.setLap3Time(new Time(1, 27, 81));
		car3 = new RaceCar("Kimmi Raikkonen", new Time(1, 27, 19));
		car3.setLap2Time(new Time(1, 25, 945));
		Team ferrari = new Team("Scuderia Ferrari", car1, car2);
		ferrari.setCar3(car3);

		//Red Bull
		car1 = new RaceCar("Pierre Gasly", new Time(1, 26, 958));
		car1.setLap2Time(new Time(1, 30, 418));
		car2 = new RaceCar("Max Verstappen", new Time(1, 27, 651));
		car2.setLap2Time(new Time(1, 26, 935));
		car3 = null;	
		Team redbull = new Team("Aston Martin Red Bull Racing", car1, car2);	
		
		formula1 = new QualifyingSession("Melbroune Circuit", mercedes, ferrari, redbull);
	
		
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.showPole();
	}

	
	public void showPole(){
		System.out.println(formula1.polePosition());
	}
}
