package designPatterns.BuilderDesign;

public class StudentBuilder {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private int age;
    private String firstName;
    private String lastName;

    public StudentBuilder addAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder addFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder addLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}