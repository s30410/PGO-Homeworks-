import java.util.ArrayList;

public class Student {
    String fname;
    String lname;
    String IndexNumber;
    String email;
    String address;
    ArrayList<Double> grades;

    public Student(String fname, String lname, String IndexNumber, String email, String address) {
        this.fname=fname;
        this.lname=lname;
        this.IndexNumber=IndexNumber;
        this.email=email;
        this.address=address;
        this.grades=new ArrayList<>();
    }
    public void addGrade(double grade) throws Exception{
        if (grades.size() > 20){
            throw new Exception("The size is too high");
        }
        if (grade < 2 || grade > 5){
            throw new Exception("Invalid grade provided: " + grade);
        }
        grades.add(grade);

    }

    public double getAverage(ArrayList<Double>grades) {
        if (this.grades.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (Double grade : this.grades) {
            sum += grade;
        }

        return sum / 20;
    }



}
