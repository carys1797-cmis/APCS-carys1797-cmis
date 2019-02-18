
public class SongApplication
{
    public static void main(String args[]){
        Song song1 = new Song();
        System.out.println(song1);
        Song song2 = new Song("All I Want", "Kodaline", 5.19, true, 2013);
        System.out.println(song2);
    }
}
