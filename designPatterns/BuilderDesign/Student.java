package designPatterns.BuilderDesign;

public class Student {
    private int age;
    private String firstName;
    private String lastName;

    public Student(StudentBuilder builder) {
        this.age = builder.getAge();
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
    }

    @Override
    public String toString() {
        return this.age + " " + this.firstName + " " + this.lastName;
    }
}