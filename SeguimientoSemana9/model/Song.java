package model;


public class Song {
	
	
	private String name;
	
	private int durataionInMinutes;
	
	private String lyrics;
	

	public Song(String name, int durataionInMinutes, String lyrics) {
		this.name = name;
		this.durataionInMinutes = durataionInMinutes;
		this.lyrics = lyrics;
	}

	public String getName() {
		return name;
	}

	public int getDurataionInMinutes() {
		return durataionInMinutes;
	}

	public String getLyrics() {
		return lyrics;
	}


	
	

}
