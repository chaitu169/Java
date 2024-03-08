package Java.DesignPatterns.Singleton;

public class Main {
    public static void main(String[] args){
        DatabaseConnection dbc = DatabaseConnection.getInstance();
        DatabaseConnection dbc2 = DatabaseConnection.getInstance();

        System.out.println(5);
    }
}
