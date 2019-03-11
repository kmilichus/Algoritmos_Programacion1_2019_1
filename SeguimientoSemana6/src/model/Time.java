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

public class Time {
	
	
	private int seconds;
	
	private int minutes;
	
	private int miliseconds;

	public Time( int minutes, int seconds, int miliseconds) {
		this.seconds = seconds;
		this.minutes = minutes;
		this.miliseconds = miliseconds;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getMiliseconds() {
		return miliseconds;
	}

	public void setMiliseconds(int miliseconds) {
		this.miliseconds = miliseconds;
	}
	
	public boolean isFaster(Time t){
		boolean faster = false;
		
		if(minutes<t.getMinutes()){
			faster = true;
		}else if (minutes==t.getMinutes() && seconds<t.getSeconds()){
			faster = true;
		}else if (minutes==t.getMinutes() && seconds==t.getSeconds() && miliseconds<t.getMiliseconds()){
			faster = true;
		}
		return faster;
		
	}
	
	public String toString() {
		return minutes + "."+seconds+"."+miliseconds;
	}
	

}
