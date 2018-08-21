public class Random
{
    public static void main (String args[])
    {
        String word, letter;
        word = "test";
        letter = "t";
        int i = 0;

        i = word.indexOf(letter);

        while (i > -1) {
            // store i in arrayList
            i = word.indexOf(letter, i + 1);}
        System.out.println(i);
        String name = "Carys";
        String difspell = name.setCharAt(3, "i");
    }
}