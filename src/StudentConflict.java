/**
 * Class: StudentConflict
 *  @author Noor Eshai
 *  @version 1.0
 *  Course : ITEC 2140 Course 03 Spring 2024
 *  Written: April 14, 2024
 *  This class - Print out if there is conflicting names in the record.
 */



public class StudentConflict {
        private int id;
        private int age;
        private double gpa;
        private int creditHoursAccomplished;
        private String name;

        public StudentConflict(int id, String name, int age, double gpa, int creditHoursAccomplished) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gpa = gpa;
            this.creditHoursAccomplished = creditHoursAccomplished;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }
            this.age = age;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            if (gpa < 0.0 || gpa > 4.0) {
                throw new IllegalArgumentException("GPA must be between 0.0 and 4.0.");
            }
            this.gpa = gpa;
        }

        public int getCreditHoursAccomplished() {
            return creditHoursAccomplished;
        }

        public void setCreditHoursAccomplished(int creditHoursAccomplished) {
            if (creditHoursAccomplished < 0) {
                throw new IllegalArgumentException("Credit hours cannot be negative.");
            }
            this.creditHoursAccomplished = creditHoursAccomplished;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            StudentConflict that = (StudentConflict) obj;
            return id == that.id;
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(id);
        }

        @Override
        public String toString() {
            return "StudentConflict{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public static void main(String[] args) {
            StudentConflict student1 = new StudentConflict(1, "John Doe", 20, 3.6, 15);
            StudentConflict student2 = new StudentConflict(1, "Jane Doe", 21, 3.7, 18);

            System.out.println("student1 is equal to student2: " + student1.equals(student2));

            System.out.println(student1);
            System.out.println(student2);
        }
    }
