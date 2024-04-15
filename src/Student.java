/**
 * Class: Student
 *  @author Noor Eshai
 *  @version 1.0
 *  Course : ITEC 2140 Course 03 Spring 2024
 *  Written: April 14, 2024
 *  This class - Will print out Student ID number, Student Age, Student GPA,
 *  Student Credit hour. and write out under the id, gpa, and credit hours under.
 */



public class Student {
    private int id;
    private int age;
    private double gpa;
    private int creditHoursAccomplished;

    public Student(int id, int age, double gpa, int creditHoursAccomplished){
        this.id=id;
        this.age=age;
        this.gpa=gpa;
        this.creditHoursAccomplished=creditHoursAccomplished;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCreditHoursAccomplished() {
        return creditHoursAccomplished;
    }

    public void setCreditHoursAccomplished(int creditHoursAccomplished) {
        this.creditHoursAccomplished = creditHoursAccomplished;
    }
    public String toString () {
        return "Student{" + "id="+ id + ", gpa=" + gpa +
                ", creditHoursAccomlished=" + creditHoursAccomplished +
                '}';
    }
    public static void main(String[] args)
    {
        Student student = new Student(1, 20, 3.6, 15);
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student GPA: " + student.getGpa());
        System.out.println("Student Credit Hours: " + student.getCreditHoursAccomplished());

        student.setAge(21);
        student.setGpa(3.8);
        student.setCreditHoursAccomplished(18);

        System.out.println(student);

    }
}
