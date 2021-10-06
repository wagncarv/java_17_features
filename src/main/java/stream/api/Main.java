package stream.api;

import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        List<Car> cars = List.of(
                new Car("BMW", 120000),
                new Car("Jaguar", 150000),
                new Car("Tesla", 176000),
                new Car("Renault", 48000)
        );

//        cars.forEach(System.out::println);

        cars.stream()
                .sorted((c1, c2) -> Double.valueOf(c1.getPrice()).compareTo(Double.valueOf(c2.getPrice())))
                .map(c -> new Car(c.getBrand().toLowerCase(), c.getPrice()))
                .peek(Car::addTax)
                .forEach(System.out::println);

    }
}
