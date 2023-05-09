package cloneable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student john = new Student("John", 20, "male", "BME");
        Student newJohn = john.clone();
        System.out.println(newJohn.getName());
        System.out.println(newJohn.getAge());
        System.out.println(newJohn.getGender());
        System.out.println(newJohn.getPreviousOrganization());
    }
}
