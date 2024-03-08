package OOPS.Polymorphism;

public class UI {
    String environment;

    String getButton(){
        System.out.println("Button");
        return "Button";
    }

    String getButton(String color){
        System.out.println("colorButton");
        return "colorButton";
    }
}
