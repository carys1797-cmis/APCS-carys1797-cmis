
public abstract class Student
{
    private String fname;
    private String major;
    private int unitsTaken;
    
    public Student(String fn, String m, int ut){
        this.fname = fn;
        this.major = m;
        this.unitsTaken = ut;
    }
    
    public String getfName(){
        return fname;
    }
    
    public void setfName(String fn){
        this.fname = fn;
    }
    
    public String getMajor(){
        return major;
    }
    
    public void setMajor(String m){
        this.major = m;
    }
    
    public int getUnitsTaken(){
        return unitsTaken;
    }
    
    public void setUnitsTaken(int ut){
        this.unitsTaken = ut;
    }
    
    abstract public int calculateTuition(int units);
}
