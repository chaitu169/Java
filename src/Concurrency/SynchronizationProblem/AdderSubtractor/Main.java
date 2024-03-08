package Concurrency.SynchronizationProblem.AdderSubtractor;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count c = new Count(0);

        Adder adder = new Adder(c);
        Subtractor subtractor = new Subtractor(c);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.join();
        t2.join();

        System.out.println(c.count);

        System.out.println(1);
    }
}
