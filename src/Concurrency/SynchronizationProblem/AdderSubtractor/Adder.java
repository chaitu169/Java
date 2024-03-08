package Concurrency.SynchronizationProblem.AdderSubtractor;

public class Adder implements Runnable{
    Count c;
    public Adder(Count c){
        this.c = c;
    }

    @Override
    public void run(){
        for(int i=0; i<=200000000; i++){
            this.c.count += i;
        }
    }
}
