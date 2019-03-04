
public class Language
{
    private String name;
    private int numCountriesWhoSpeak;
    boolean tonal;

    public Language(){
        this.name = "English";
        this.numCountriesWhoSpeak = 50;
        this.tonal = false;
    }

    public Language(String name, int num, boolean tonal){
        this.name = name;
        this.numCountriesWhoSpeak = num;
        this.tonal = tonal;
    }

    public String toString(){
        return "Name: " + name + "\nNumber of Countries That Speak: " + numCountriesWhoSpeak + "\nTonal: " + tonal + "\n";
    }
}
