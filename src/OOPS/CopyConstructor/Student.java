package OOPS.CopyConstructor;

public class Student {
    String name;
    int rollNumber;
    String className;
    int age;
    double attendance;

    //parameterized constructor
    public Student(String name, int rollNumber, String className, int age, double attendance){
        this.name = name;
        this.rollNumber = rollNumber;
        this.className = className;
        this.age = age;
        this.attendance = attendance;
    }

    //copy constructor
    public Student(Student st){
        this.name = st.name;
        this.rollNumber = st.rollNumber;
        this.className = st.className;
        this.age = st.age;
        this.attendance = st.attendance;
    }
}
