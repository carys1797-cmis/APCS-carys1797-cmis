

public class AsteroidMan extends SuperHero
{
    public AsteroidMan(){
        super();
    }
    
    public AsteroidMan(String sc, boolean hc){
        super();
        setSuitColor(sc);
        setCape(hc);
    }
    
    public String motto(){
        return "Rock your world";
    }
    
    public String toString(){
        return "AsteroidMan: " + super.toString();
    }
}
