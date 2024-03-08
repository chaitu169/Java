package Concurrency.SynchronizationProblem.AdderSubtractor;

public class Subtractor implements Runnable{
    Count c;

    Subtractor(Count c){
        this.c = c;
    }

    @Override
    public void run(){
        for(int i=0; i<=2000000000; i++){
            this.c.count = this.c.count - i;
        }
    }
}
