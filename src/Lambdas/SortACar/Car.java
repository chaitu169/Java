package Lambdas.SortACar;

import java.util.Comparator;

public class Car {
    public String name;
    public int price;
    public int power;

    public Car(String name, int price, int power){
        this.name = name;
        this.price = price;
        this.power = power;
    }

    Comparator<Car> carComparator = new Comparator<Car>() {
        @Override
        public int compare(Car o1, Car o2) {
            return o1.power - o2.power;
        }
    };
}
