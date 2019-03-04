
public class Student
{
    private String firstname;
    private String lastname;
    private int age;
    private boolean girl;

    public Student(){
        this.firstname = "John";
        this.lastname = "Dough";
        this.age = 12;
        this.girl = false;
    }

    public Student(String firstname, String lastname, int age, boolean girl){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.girl = girl;
    }

    public String toString(){
        return "Firstname: " + firstname + "\nLast Name: " + lastname + "\nAge: " + age + "\nGirl: " + girl + "\n";
    }
}
