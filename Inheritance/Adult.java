
public class Adult extends Person
{
    private String job;
    private boolean parent;

    public Adult(){
        super();
    }
    
    public Adult(Place location, boolean parent){
        
    }
    
    public String getJob(){
        return this.job;
    }
    
    public boolean getParent(){
        return this.parent;
    }
    
    public void setJob(String j){
        this.job = j;
    }
    
    public void setParent(boolean p){
        this.parent = p;
    }
}
