package model;


import java.util.ArrayList;

public class Artist {
	
	public final static String RAP = "Rap";
	
	public final static String ROCK = "Rock n' Roll";
	
	public final static String POP = "Pop";
	
	public final static String ELECTRO_HOUSE = "Electro - house";
	
	
	private String name;
	
	private String musicalGenre;
	
	private ArrayList<Song> songs;
	
	public Artist(String name, String musicalGenre) {
		this.name = name;
		this.musicalGenre = musicalGenre;
		songs = new ArrayList<>();
	}


	public String getName() {
		return name;
	}

	public String getMusicalGenre() {
		return musicalGenre;
	}

	public ArrayList<Song> getSongs() {
		return songs;
	}
	
	public boolean equals(String n) {
		return n.equals(name);	
	}


}
