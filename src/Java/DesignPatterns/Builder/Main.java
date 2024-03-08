package Java.DesignPatterns.Builder;

public class Main {
    public static void main(String[] args){
//        Builder studentBuilder = Student.builder();
//        studentBuilder.setAge(18);
//        studentBuilder.setName("chaitu");
//        studentBuilder.setBatch("22Intermediate");
//        studentBuilder.setPsp(92);
//        studentBuilder.setCompanyName("GEP");
//        studentBuilder.setGradYear(2023);
//        studentBuilder.setUnivName("NIT Agartala");

        Student std = Student.builder().
                setAge(32).
                setName("Chaitu").
                build();

    }
}
