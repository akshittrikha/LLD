package designPatterns.BuilderDesign;

public class Main {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();

        studentBuilder.addAge(24);
        studentBuilder.addFirstName("Akshit");
        studentBuilder.addLastName("Trikha");

        Student student = studentBuilder.build();

        System.out.println(student);
    }
}