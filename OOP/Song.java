
public class Song
{
    private String name;
    private String artist;
    private double length;
    private boolean clean;
    private int yearReleased;
    
    public Song() {
        this.name = "Let It Be";
        this.artist = "The Beatles";
        this.length = 3.54;
        this.clean = true;
        this.yearReleased = 1970;
    }
    
    public Song(String nm, String att, double len, boolean cln, int yr){
        this.name = nm;
        this.artist = att;
        this.length = len;
        this.clean = cln;
        this.yearReleased = yr;
    }
    
    public String toString(){
        return "Name: " + name + "\nArtist: " + artist + "\nLength: " + length + "\nClean: " + clean + "\nYear Released: " + yearReleased + "\n";
    }
}
