package ExceptionHandling;

public class Client {
    public static void main(String[] args){

        try {
            Pair pair = new Pair("Java", "Language");
            System.out.println(pair.first + " " + pair.second);
            return;
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally");
        }

        System.out.println("Main Method Ended");
    }
}
