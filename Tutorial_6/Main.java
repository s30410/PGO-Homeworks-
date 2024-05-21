import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Developer dev = new Developer("Jonh", "Doe", "Warsaw", "john@doe.com", "123456789", 2020);
        Technology t = new Technology("Java", 800);
        dev.addTechnology(t);
        employees.add(dev);

        Teaster teaster = new Teaster("Jane", "Smith", "Wroclaw", "jane@smith.com", "987654321", 2021);
        teaster.addTestType("UX/UI");
        employees.add(teaster);

        Manager manager = new Manager("Bob", "Johnson", "Krakow", "jane@smith.com", "123456788", 2019);
        Goal g = new Goal("Implementing FB login", 2024, 5,15, 1000);
        manager.addGoal(g);
        employees.add(manager);

        int totalAmount = 0;
        for (Employee employee: employees) {
            totalAmount += employee.calculateSalary();
        }

        System.out.println("Total amount to be paid this month: " + totalAmount + " USD");

    }
}