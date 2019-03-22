import java.util.*;
public class School
{
    private String name;
    private List<Student> students;

    public School(String n){
        this.name = n;
        this.students = new ArrayList<Student>();
    }

    public String getName(){
        return name;
    }

    public List<Student> getStudents(){
        return students;
    }

    public void addStudent(Student s){
        students.add(s);
    }

    public double getAvgGPA(){
        double avg = 0;
        for(Student student: students){
            avg += student.gpa();
        }
        avg /= students.size();
        return avg;
    }
    
    public String toString(){
        return "Name: " + name + "\nEnrollement: " + students.size();
    }
}
