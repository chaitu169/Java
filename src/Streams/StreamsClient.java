package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsClient {
    public static void main(String[] args){
        //Streams are a wrapper over data collections, That provides a way to iterate over data collections, [map. filter...]
        Stream<Integer> stream = Stream.of(1,2,33,5);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(9);

        List<Integer> filteredList = list.stream().filter((x) -> x%2 == 0).toList();

        System.out.println(filteredList);
    }
}
