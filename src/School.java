/**
 * Class: School
 *  @author Noor Eshai
 *  @version 1.0
 *  Course : ITEC 2140 Course 03 Spring 2024
 *  Written: April 14, 2024
 *  This class - Print out the youngest student, oldest student,
 *  and after removing the youngest student it will show the new youngest student.
 */

import java.util.ArrayList;
import java.util.List;

public class School {
        private List<StudentConflict> students;

        public School() {
            this.students = new ArrayList<>();
        }

        public void addStudent(StudentConflict student) {
            this.students.add(student);
        }

        public void removeStudent(StudentConflict student) {
            this.students.remove(student);
        }

        public StudentConflict findYoungestStudent() {
            if (students.isEmpty()) {
                return null;
            }

            StudentConflict youngest = students.get(0);
            for (StudentConflict student : students) {
                if (student.getAge() < youngest.getAge()) {
                    youngest = student;
                }
            }
            return youngest;
        }

        public StudentConflict findOldestStudent() {
            if (students.isEmpty()) {
                return null;
            }

            StudentConflict oldest = students.get(0);
            for (StudentConflict student : students) {
                if (student.getAge() > oldest.getAge()) {
                    oldest = student;
                }
            }
            return oldest;
        }

        public static void main(String[] args) {
            School school = new School();
            school.addStudent(new StudentConflict(1, "John Doe", 20, 3.6, 15));
            school.addStudent(new StudentConflict(2, "Jane Doe", 22, 3.7, 18));
            school.addStudent(new StudentConflict(3, "Jim Beam", 18, 3.8, 20));

            StudentConflict youngest = school.findYoungestStudent();
            StudentConflict oldest = school.findOldestStudent();

            System.out.println("Youngest Student: " + youngest);
            System.out.println("Oldest Student: " + oldest);

            school.removeStudent(youngest);
            System.out.println("After removing the youngest student:");
            System.out.println("New Youngest Student: " + school.findYoungestStudent());
        }
    }

