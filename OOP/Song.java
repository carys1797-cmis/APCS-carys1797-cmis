
public class Song
{
    private double length;
    private String name;
    private String artist;
    private boolean clean;
    private int yearReleased;
    
    public Song() {
        this.length = 3.54;
        this.name = "Let It Be";
        this.artist = "The Beatles";
        this.clean = true;
        this.yearReleased = 1970;
    }
    
    public Song(double len, String nm, String att, boolean cln, int yr){
        this.length = len;
        this.name = nm;
        this.artist = att;
        this.clean = cln;
        this.yearReleased = yr;
    }
    public String toString(double len){
        String length = (String) len;
        return length;
    }
}
