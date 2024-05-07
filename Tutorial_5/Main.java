import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12", "333-322-222", new Date(1980,1,1));

        Studies IT = new Studies("IT", "AAA", 7, 5 );

        s1.enrollStudent(IT);

        s1.addGrade(5, "PGO");
        s1.addGrade(2, "APBD");

        Student.promoteAllStudents();

        Student.displayInfoAboutAllStudents();

    }
}