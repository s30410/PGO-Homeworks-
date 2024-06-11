import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Porsche 911", 2018));
        cars.add(new Car("Porsche Cayman", 2020));
        cars.add(new Car("Porsche Boxster", 2015));
        cars.add(new Car("Porsche Macan", 2017));
        cars.add(new Car("Porsche Cayenne", 2019));
        cars.add(new Car("Porsche Panamera", 2016));
        cars.add(new Car("Porsche Taycan", 2021));
        cars.add(new Car("Porsche 918 Spyder", 2014));
        cars.add(new Car("Porsche 959", 2022));
        cars.add(new Car("Porsche Carrera GT", 2013));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}