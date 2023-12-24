import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "john.doe@email.com");
        Student student = new Student("Alice Smith", "alice.smith@email.com", new int[]{85, 90, 78});
        Professor professor = new Professor("Dr. Smith", "dr.smith@email.com", new String[]{"Math", "Physics"});

        System.out.println("Person: " + person.getName() + ", " + person.getEmail());
        System.out.println("Student: " + student.getName() + ", " + student.getEmail() + ", Grades: " + Arrays.toString(student.getGrades()));
        System.out.println("Professor: " + professor.getName() + ", " + professor.getEmail() + ", Courses: " + Arrays.toString(professor.getCourses()));
    }
}

class Person {
    private String name;
    private String email;


    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Student extends Person {
    // Proprietate adițională pentru Student
    private int[] grades;

    public Student(String name, String email, int[] grades) {
        super(name, email);
        this.grades = grades;
    }


    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}

class Professor extends Person {
    private String[] courses;

    public Professor(String name, String email, String[] courses) {
        super(name, email);
        this.courses = courses;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
