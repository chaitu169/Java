package Concurrency;

import Concurrency.Runnable.Namaskaram;

public class Main {
    public static void main(String[] args){
        Namaskaram n = new Namaskaram();

        //create a thread and start it
        Thread t = new Thread(n);
        t.start();
    }
}
