import java.util.*;
public class Student
{
    private String name;
    private List<Course> courses;
    private int gradeLevel;

    public Student(String n, int gl){
        this.name = n;
        this.gradeLevel = gl;
        this.courses = new ArrayList<Course>();
    }

    public double gpa(){
        double gpa = 0;
        for(Course course : courses){
            gpa += course.getGrade();
        }
        gpa /= courses.size();
        return gpa;
    }

    public void addCourse(Course c){
        courses.add(c);
    }
    
    public String toString(){
        String out = String.format("Name: %s\nGrade Level: %s\nGPA: %s\nCourses\n-------", name, gradeLevel, gpa());
        for(int i = 0; i < courses.size(); i++){
            out += String.format("\n%s) %s", i+1, courses.get(i));
        }
        return out;
    }
}
