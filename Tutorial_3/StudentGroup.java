import java.util.ArrayList;

public class StudentGroup {
    public String name;
    ArrayList<Student> students;

    public StudentGroup(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) throws IllegalStateException {
        if (students.size() >= 15) {
            throw new IllegalStateException("Maximum number of students in the group reached.");
        }
        if (students.contains(student)) {
            throw new IllegalStateException("Student is already in the group.");
        }
        students.add(student);
    }
}

