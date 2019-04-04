
public class BigGranny extends SuperHero
{
    public BigGranny(){
        super();
    }
    
    public BigGranny(String sc, boolean hc){
        super();
        setSuitColor(sc);
        setCape(hc);
    }
    
    public String motto(){
        return "Sugar, spice and all things nice";
    }
    
    public String toString(){
        return "BigGranny: " + super.toString();
    }
}
