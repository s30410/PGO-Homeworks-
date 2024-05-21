import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

class Manager extends Employee {
    private List<Goal> goals;

    public Manager(String fname, String lname, String address, String email, String pesel, int yearOfEmployment) {
        super(fname, lname, address, email, pesel, yearOfEmployment);
        this.goals=new ArrayList<>();
    }

    public void addGoal(Goal goal){
        this.goals.add(goal);
    }

    @Override
    public int calculateSalary() {
        int salary= super.calculateSalary();
        LocalDate currentDate = LocalDate.now();
        int currentMonth = currentDate.getMonthValue();
        int currentYear = currentDate.getYear();
        int currentDay = currentDate.getDayOfMonth();

        for (Goal goal : goals) {
            if (goal.getMonth() == currentMonth &&
                goal.getYear() == currentYear &&
                goal.getDay() == currentDay) {
                salary += goal.getBonus();
            }
        }
        return salary;

    }
}
