package ExceptionHandling;

public class Pair {
    public String first;

    public String second;

    public Pair(String first, String second){

        if(first == null && second == null){
            throw new RuntimeException("first and second values are null");
        }

        this.first = first;
        this.second = second;
    }
}
