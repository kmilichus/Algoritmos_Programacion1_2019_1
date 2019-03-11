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

public class QualifyingSession {
	
	private String trackName;
	
	private Team team1;
	
	private Team team2;
	
	private Team team3;
	
	public QualifyingSession(String trackName, Team team1, Team team2, Team team3) {
		this.trackName = trackName;
		this.team1 = team1;
		this.team2 = team2;
		this.team3 = team3;
	}

	public String getTrackName() {
		return trackName;
	}

	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}

	public Team getTeam1() {
		return team1;
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	public Team getTeam2() {
		return team2;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

	public Team getTeam3() {
		return team3;
	}

	public void setTeam3(Team team3) {
		this.team3 = team3;
	}
	
	
	public String polePosition(){
		
		String msj = "El piloto de la pole position es ";
		
		RaceCar r = team1.bestTeamCar();
		
		if(team2.bestTeamCar().bestLapTime().isFaster(r.bestLapTime())){
			 r = team2.bestTeamCar();
		}
		
		if(team3.bestTeamCar().bestLapTime().isFaster(r.bestLapTime())){
			 r = team3.bestTeamCar();
		}
		
		msj+= r.getDriverName() + " con un tiempo de "+ r.bestLapTime().toString();
		
		return msj;
	}
	

}
