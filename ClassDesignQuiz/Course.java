import java.util.*;
public class Course
{
    private String courseName;
    private double grade;

    public Course(String cn, double g){
        this.courseName = cn;
        this.grade = g;
    }

    public double getGrade(){
        return grade;
    }
    
    public String toString(){
        return String.format("%s: %s", courseName, grade);
    }
}
