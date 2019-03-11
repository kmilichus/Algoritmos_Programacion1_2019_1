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

public class RaceCar {
	
	
	private String driverName;
	
	private Time lap1Time;
	
	private Time lap2Time;
	
	private Time lap3Time;

	public RaceCar(String driverName, Time lap1Time) {
		this.driverName = driverName;
		this.lap1Time = lap1Time;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public Time getLap1Time() {
		return lap1Time;
	}

	public void setLap1Time(Time lap1Time) {
		this.lap1Time = lap1Time;
	}

	public Time getLap2Time() {
		return lap2Time;
	}

	public void setLap2Time(Time lap2Time) {
		this.lap2Time = lap2Time;
	}

	public Time getLap3Time() {
		return lap3Time;
	}

	public void setLap3Time(Time lap3Time) {
		this.lap3Time = lap3Time;
	}
	
	
	public Time bestLapTime(){
		Time t = lap1Time;
		
		if(lap2Time != null && lap2Time.isFaster(t)){
			t = lap2Time;
		}
		
		if(lap3Time != null && lap3Time.isFaster(t)){
			t = lap3Time;
		}
		
		return t;
	}
	
}
