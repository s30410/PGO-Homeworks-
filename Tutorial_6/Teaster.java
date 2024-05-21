import java.util.ArrayList;
import java.util.List;

class Teaster extends Employee {
    private List<String> testTypes;
    private static final int testBonus = 300;

    public Teaster(String fname, String lname, String address, String email, String pesel, int yearOfEmployment) {
        super(fname, lname, address, email, pesel, yearOfEmployment);
        this.testTypes=new ArrayList<>();

    }

    public void addTestType (String testType) {
        this.testTypes.add(testType);
    }

    public int calculateSalary(){
        int salary = super.calculateSalary();
        salary += testTypes.size() * testBonus;

        return  salary;
    }
}
