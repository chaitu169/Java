package Concurrency.MultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> listToSort = List.of(3,8,21,2,9,0,1);

        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSorter m = new MergeSorter(listToSort, executorService);

        Future<List<Integer>> futureSortedList = executorService.submit(m);

        List<Integer> sortedList = futureSortedList.get();

        executorService.shutdown();
    }
}
