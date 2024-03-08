package Concurrency.MultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    public List<Integer> listToSort;
    public ExecutorService executorService;
    public MergeSorter(List<Integer> listToSort, ExecutorService executorService){
        this.listToSort = listToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        int size = listToSort.size();

        if(size <= 1){
            return listToSort;
        }

        List<Integer> leftHalf = new ArrayList<Integer>();
        List<Integer> rightHalf = new ArrayList<Integer>();

        for(int i=0; i<size/2; i++){
            leftHalf.add(listToSort.get(i));
        }

        for(int i=size/2; i<size; i++){
            rightHalf.add(listToSort.get(i));
        }

        Future<List<Integer>> futureLeftSortedHalf = executorService.submit(new MergeSorter(leftHalf, executorService));
        Future<List<Integer>> futureRightSortedHalf = executorService.submit(new MergeSorter(rightHalf, executorService));

        List<Integer> leftSortedHalf = futureLeftSortedHalf.get();
        List<Integer> rightSortedHalf = futureRightSortedHalf.get();

        int i = 0;
        int j = 0;
        List<Integer> mergedArray = new ArrayList<Integer>();

        while(i < leftSortedHalf.size() && j < rightSortedHalf.size()){
            if(leftSortedHalf.get(i) > rightSortedHalf.get(j)){
                mergedArray.add(rightSortedHalf.get(j));
            }else if(leftSortedHalf.get(i) < rightSortedHalf.get(j)){
                mergedArray.add(leftSortedHalf.get(i));
            }else{
                mergedArray.add(leftSortedHalf.get(i));
                mergedArray.add(rightSortedHalf.get(j));
            }
        }

        while(i < leftSortedHalf.size()){
            mergedArray.add(leftSortedHalf.get(i));
            i++;
        }

        while(j < rightSortedHalf.size()){
            mergedArray.add(rightSortedHalf.get(j));
            j++;
        }

        return mergedArray;
    }
}
