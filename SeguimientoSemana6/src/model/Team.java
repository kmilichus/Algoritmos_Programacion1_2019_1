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
package model;

public class Team {
	
	private String teamName;
	
	private RaceCar car1;
	
	private RaceCar car2;
	
	private RaceCar car3;

	public Team(String teamName, RaceCar car1, RaceCar car2) {
		this.teamName = teamName;
		this.car1 = car1;
		this.car2 = car2;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public RaceCar getCar1() {
		return car1;
	}

	public void setCar1(RaceCar car1) {
		this.car1 = car1;
	}

	public RaceCar getCar2() {
		return car2;
	}

	public void setCar2(RaceCar car2) {
		this.car2 = car2;
	}

	public RaceCar getCar3() {
		return car3;
	}

	public void setCar3(RaceCar car3) {
		this.car3 = car3;
	}
	
	public RaceCar bestTeamCar(){
		
		RaceCar r = car1;
		
		if (car2.bestLapTime().isFaster(r.bestLapTime())) {
			r = car2;
		}
		
		if (car3 != null && car3.bestLapTime().isFaster(r.bestLapTime())) {
			r = car3;
		}
		
		return r;
	}
	

}
