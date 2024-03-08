package OOPS.CopyConstructor;

public class Main {
    public static void main(String[] args){
        Student s = new Student("chaitanya", 1, "web development", 22, 79.32);

        Student copyOfS = new Student(s);

        System.out.println("Copied the object");
    }
}
