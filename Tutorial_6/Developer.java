import java.util.ArrayList;
import java.util.List;

class Developer extends Employee {
    private List<Technology> technologies;

    public Developer(String fname, String lname, String address, String email, String pesel, int yearOfEmployment) {
        super(fname, lname, address, email, pesel, yearOfEmployment);
        this.technologies = new ArrayList<>();
    }

    public void addTechnology (Technology tech) {
        this.technologies.add(tech);

    }

    public int calculateSalary () {
        int salary = super.calculateSalary();
        for (Technology tech: technologies) {
            salary += tech.getBonus();
        }

        return salary;
    }
}
