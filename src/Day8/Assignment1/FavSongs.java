package Day8.Assignment1;



public class FavSongs{
	private String s_name;
	private String artist;
	public FavSongs(String s_name, String artist) {
		super();
		this.s_name = s_name;
		this.artist = artist;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	@Override
	public String toString() {
		return "FavSongs [s_name=" + s_name + ", artist=" + artist + "]";
	}
	
	


}
