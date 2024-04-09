import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student(
                "Ibraghim",
                "Khashimiri",
                "s12345",
                "s12345@pjwstk.edu.pl",
                "ul. Krakowska"
        );

        s1.addGrade(4.8);
        s1.addGrade(3.7);
        s1.addGrade(4);
        s1.addGrade(5);
        s1.addGrade(3);
        s1.addGrade(3.3);
        s1.addGrade(4);
        s1.addGrade(4.2);
        s1.addGrade(5);
        s1.addGrade(3);
        s1.addGrade(4);
        s1.addGrade(3.7);
        s1.addGrade(4);
        s1.addGrade(5);
        s1.addGrade(3);
        s1.addGrade(3.3);
        s1.addGrade(4);
        s1.addGrade(4.2);
        s1.addGrade(5);
        s1.addGrade(3);
        s1.addGrade(3);


        Student s2 = new Student(
                "Naman",
                "Cumbul",
                "s23456",
                "s23456@pjwstk.edu.pl",
                "ul.Waszyngtona"
        );
        s2.addGrade(4.8);
        s2.addGrade(3.7);
        s2.addGrade(4);
        s2.addGrade(2);
        s2.addGrade(3);
        s2.addGrade(4.8);
        s2.addGrade(3.7);
        s2.addGrade(4);
        s2.addGrade(2);
        s2.addGrade(3);
        s2.addGrade(4.8);
        s2.addGrade(3.7);
        s2.addGrade(4);
        s2.addGrade(2);
        s2.addGrade(3);
        s2.addGrade(4.8);
        s2.addGrade(3.7);
        s2.addGrade(4);
        s2.addGrade(2);
        s2.addGrade(3);

        Student s3 = new Student(
                "Vaha",
                "Udarny",
                "s34567",
                "s34567@pjwstk.edu.pl",
                "ul. Hmelna"
        );

        s3.addGrade(4);
        s3.addGrade(3);
        s3.addGrade(3.3);
        s3.addGrade(3.7);
        s3.addGrade(4);
        s3.addGrade(3.9);
        s3.addGrade(3.1);
        s3.addGrade(4);
        s3.addGrade(2);
        s3.addGrade(3.5);
        s3.addGrade(4);
        s3.addGrade(3);
        s3.addGrade(3.3);
        s3.addGrade(3.7);
        s3.addGrade(4);
        s3.addGrade(3.9);
        s3.addGrade(3.1);
        s3.addGrade(2);
        s3.addGrade(2);
        s3.addGrade(5);






        StudentGroup group = new StudentGroup("Group 1A");
        group.addStudent(s1);
        group.addStudent(s2);
        


        StudentGroup group1 = new StudentGroup("Group 1B");
        group.addStudent(s3);





        double average1 = s1.getAverage(s1.grades);
        double average2 = s2.getAverage(s2.grades);
        double average3 = s3.getAverage(s3.grades);
        System.out.println("Average grade for " + s1.fname + " " + s1.lname + " from group " + group.name + " is "+ average1 );
        System.out.println("Average grade For " + s2.fname + " " + s2.lname + " from group " + group.name + " is "+ average2 );
        System.out.println("Average grade For " + s3.fname + " " + s3.lname + " from group " + group1.name + " is "+ average3 );



    }
}