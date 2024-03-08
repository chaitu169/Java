package Generics;

public class Pair <V, S>{
    private V first;
    private S second;

    public Pair(){

    }

    public Pair(V first, S second){
        this.first = first;
        this.second = second;
    }

    public V getFirst(){
        return this.first;
    }

    public S getSecond() {
        return this.second;
    }

    public void setFirst(V first){
        this.first = first;
    }

    public void setSecond(S second){
        this.second = second;
    }

    public static <X, Y> Pair<X,Y> of(X first, Y second){
        return new Pair<>(first, second);
    }
}
