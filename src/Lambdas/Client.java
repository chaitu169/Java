package Lambdas;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Client {
    public static void main(String[] args){
        // Lambdas are just syntactical sugar to reduce the amount of code, lambdas don't optimize the code

        //This is an anonymous class,
        //Anonymous class is a class without any name used to provide method implementation.
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Class :"+ Thread.currentThread().getName());
            }
        };

        Thread t = new Thread(runnable);
        t.start();


        //Way - 2 -- using lambda expression, can only be used if interface has a single abstract method(SAM)
        Thread t2 = new Thread(() -> {System.out.println("Lamda "+ Thread.currentThread().getName());});
        t2.start();

        
    }
}
