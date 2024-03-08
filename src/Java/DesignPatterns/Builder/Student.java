package Java.DesignPatterns.Builder;

public class Student {
    String name;
    int age;
    String univName;
    int gradYear;
    double psp;
    String batch;
    String companyName;

    private Student(Builder builderStudent){
        if(builderStudent.age < 20){
            throw new IllegalArgumentException("Age must be greater than 19");
        }

        this.name = builderStudent.getName();
        this.batch = builderStudent.getBatch();
        this.univName = builderStudent.getBatch();
        this.companyName = builderStudent.getCompanyName();
    }

    public static Builder builder(){
        return new Builder();
    }

    static class Builder {
        String name;
        int age;
        String univName;
        int gradYear;
        double psp;
        String batch;
        String companyName;

        public Student build(){
            return new Student(this);
        }

        public String getName(){
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getUnivName() {
            return univName;
        }

        public int getGradYear() {
            return gradYear;
        }

        public double getPsp() {
            return psp;
        }

        public String getBatch() {
            return batch;
        }

        public String getCompanyName() {
            return companyName;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
    }
}
