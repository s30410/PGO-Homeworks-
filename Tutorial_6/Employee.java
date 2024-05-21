import java.time.LocalDate;

public class Employee {
    private String fname;
    private String lname;
    private String address;
    private String email;
    private String pesel;
    private int yearOfEmployment;
    private static final int basicSalary = 3000;
    private static final int basicBonus = 1000;



    public Employee (String fname, String lname, String address, String email, String pesel, int yearOfEmployment) {
        this.fname=fname;
        this.lname=lname;
        this.address=address;
        this.email=email;
        this.pesel=pesel;
        this.yearOfEmployment=yearOfEmployment;

    }

    public int calculateSalary () {
        int currentYear = LocalDate.now().getYear();
        int yearsWorked = currentYear - yearOfEmployment;
        return basicSalary + (yearsWorked * basicBonus);
    }

}
