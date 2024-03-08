package Generics;

public class Clinet {
    public static void main(String[] args){
        Pair<String, Integer> p =new Pair<>();
        p.setFirst("Java");
        p.setSecond(5);

        Pair<Integer, Integer> p2 = Pair.of(10, 12);
        Double avgOfP2 = findAvg(p2);

        System.out.println(avgOfP2);
    }

    //--------*********-----Bounds-----------***********-------------------------------
    public static Double findAvg(Pair<? extends Number, ? extends Number> p){
        return (p.getFirst().doubleValue() + p.getSecond().doubleValue())/2.0;
    }

    //There are two types of bounds
    //1. Upper Bounds --> extends
    //2. Lower Bounds --> super
}
