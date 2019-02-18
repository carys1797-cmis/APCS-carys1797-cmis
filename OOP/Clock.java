
public class Clock
{
    private int hours;
    private int minutes;
    private int seconds;
    
    public Clock(){
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }
    
    public Clock(int hrs, int mins, int secs){
        this.hours = hrs;
        this.minutes = mins;
        this.seconds = secs;
    }
    
    public String toString(){
        return "The time is " + hours + ":" + minutes + ":" + seconds + "\n";
    }
}
