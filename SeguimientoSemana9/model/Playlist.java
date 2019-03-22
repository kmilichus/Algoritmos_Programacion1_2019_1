package model;


import java.util.ArrayList;

public class Playlist {
	
	
	private String name;
	
	private ArrayList<Song> songs;

	public Playlist(String name) {
		this.name = name;
		songs = new ArrayList<>();
	}


	public String getName() {
		return name;
	}
	
	public int songApperences(Song s) {
		int times = 0;
		
		for (int i = 0; i < songs.size(); i++) {
			
			if(s.getName().equals(songs.get(i).getName())) {
				times++
			}
		}
		
		return times;
	}

	
	

}
