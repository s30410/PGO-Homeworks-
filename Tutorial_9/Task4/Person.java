import java.time.LocalDate;

public abstract class Person {
    public final String firstName;
    public final String lastName;
    public final int birthdayYear;

    public Person (String firstName, String lastName, int birthdayYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;

    }

    public int getAge () {
        int currentYear = LocalDate.now().getYear();
        int Age = currentYear - birthdayYear;
        return Age;
    }

}
