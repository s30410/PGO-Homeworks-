public final class Manager extends Employee{
    public double bonus;

    public Manager(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary, double bonus) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
        this.bonus=bonus;
    }

    public double getSalary () {
        return super.getSalary() + bonus;
    }

    public String toString () {
        return "Manager with last name " + lastName + " and age " + getAge() + " has a salary " + getSalary();
    }
}
