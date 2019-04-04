
public class FriedEggMan extends SuperHero
{
    public FriedEggMan(){
        super();
    }
    
    public FriedEggMan(String sc, boolean hc){
        super();
        setSuitColor(sc);
        setCape(hc);
    }
    
    public String motto(){
        return "Sunny-Side-Up";
    }
    
    public String toString(){
        return "FriedEggMan: " + super.toString();
    }
}
