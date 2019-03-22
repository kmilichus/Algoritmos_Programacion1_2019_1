package model;


import java.util.ArrayList;

public class Karaoke {

	public final static int ARTISTS_AMOUNT = 10;

	private Artist[] artists;
	
	private ArrayList<Playlist> lists;

	public Karaoke() {
		artists = new Artist[ARTISTS_AMOUNT];
		lists = new ArrayList<>();
	}
	
	public Song findMorePopularSongsOfAnArtistInPlaylists(String artistName) {
		
		ArrayList<Song> artistSongs = null;
		
		for (int i = 0; i < ARTISTS_AMOUNT && artistSongs==null; i++) {	
			if(artists[i]!=null && artists[i].equals(artistName)) {
				artistSongs = artists[i].getSongs();
			}	
		}
		Song popular = null;
		
		if(artistSongs!=null){
			
		popular = artistSongs.get(0);
		int numApperences = countApperences(popular);
		
		for (int i = 1; i < artistSongs.size(); i++) {
			
			if(countApperences(artistSongs.get(i)) > numApperences) {
				popular = artistSongs.get(i);
				numApperences = countApperences(popular);
			}
			
		}
		
		}

		return popular;
		
	}
	
	
	public int countApperences(Song s) {
		
		int count = 0;	
		for (int i = 0; i < lists.size(); i++) {	
				count+= lists.get(i).songApperences(s);	
		}
		
		return count;
	}
	
	
	
	
			
}
