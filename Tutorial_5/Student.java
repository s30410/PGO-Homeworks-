import java.util.*;

public class Student {
    private static int nextIndexNumber = 1;
    private String fname;
    private String lname;
    private String IndexNumber;
    private String email;
    private String address;
    private String phonenumber;
    private String Status;
    private Date date;
    private int currentSemester;
    private List<Studies> studiesList;
    private Map<Integer, String> grades;


    public Student (String fname, String lname, String email, String address, String phonenumber, Date date) {
        this.fname=fname;
        this.lname=lname;
        this.email=email;
        this.address=address;
        this.phonenumber=phonenumber;
        this.date=date;
        this.IndexNumber = "s" + nextIndexNumber++;
        this.Status= "Candidate";
        this.studiesList = new ArrayList<>();
        this.grades = new HashMap<>();


    }

    public void addGrade(int grade, String subject) throws Exception {
        if (grade < 2 || grade > 5) {
            throw new Exception("Invalid grade provided: " + grade);
        }

        this.grades.put(grade, subject);
    }

    public void enrollStudent(Studies studies) {
        this.studiesList.add(studies);
        this.currentSemester = 1;
    }

    public static void promoteAllStudents() {
        for (Student student : allStudents) {
            if (student.getCurrentSemester() < student.getStudiesList().get(0).getNOfSemesters()) {
                if (student.getNOfITNs() < student.getStudiesList().get(0).getNOfITNs()) {
                    student.setCurrentSemester(student.getCurrentSemester() + 1);
                } else {
                    student.setStatus("Graduate");
                }
            } else {
                student.setStatus("Graduate");
            }
        }
    }



    public static void displayInfoAboutAllStudents() {
        for (Student student : allStudents) {
            System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
            System.out.println("Index Number: " + student.getIndexNumber());
            System.out.println("Current Semester: " + student.getCurrentSemester());
            System.out.println("Status: " + student.getStatus());
            System.out.println();
        }
    }

    public String getFirstName() {
        return fname;
    }

    public void setFirstName(String fname) {
        this.fname = fname;
    }

    public String getLastName() {
        return lname;
    }

    public void setLastName(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phonenumber;
    }

    public void setPhoneNumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Date getBirthdate() {
        return date;
    }

    public void setBirthdate(Date date) {
        this.date = date;
    }

    public String getIndexNumber() {
        return IndexNumber;
    }

    public void setIndexNumber(String IndexNumber) {
        this.IndexNumber = IndexNumber;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    public List<Studies> getStudiesList() {
        return studiesList;
    }

    public void setStudiesList(List<Studies> studiesList) {
        this.studiesList = studiesList;
    }

    public Map<Integer, String> getGrades() {
        return grades;
    }

    public void setGrades(Map< Integer, String> grades) {
        this.grades = grades;
    }


}
