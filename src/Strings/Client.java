package Strings;

public class Client {
    public static void main(String[] args){
        //This piece of code is written to understand about how strings work in java
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println((s1 == s2) + " " + s1.equals(s2));
        System.out.println((s1 == s3) + " " + s1.equals(s3));
        System.out.println((s3 == s4) + " " + s3.equals(s4));
    }
}
