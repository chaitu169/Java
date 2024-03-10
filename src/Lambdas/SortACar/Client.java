package Lambdas.SortACar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Car c1 = new Car("Audi", 2, 60);
        Car c2 = new Car("Benz", 1, 30);
        Car c3 = new Car("Benz", 3, 80);
        Car c4 = new Car("Benz", 9, 10);
        Car c5 = new Car("Benz", 12, 20);

        List<Car> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);

        cars.forEach((c) -> {
            System.out.println(c.price);
        });

        //Way -1 creating comparator using anonymous class
        Comparator<Car> carComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.price - o2.price;
            }
        };

        //Collections.sort(cars, carComparator);


        //Way-2 sorting using lambda function
        Collections.sort(cars, (car1, car2) -> car1.price - car2.price);


        cars.forEach((c) -> {
            System.out.println(c.price);
        });
    }
}
