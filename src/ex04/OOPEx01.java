package ex04;
// Object-Oriented Programming
class Person3 { // define an object named as "Person3"
    // declare status
    int weight = 100;
}

public class OOPEx01 {
    public static void main(String[] args) {
        Person3 p3 = new Person3();
        System.out.println("p3의 몸무게: " + p3.weight);

        p3.weight = 60; // Not allowed. status should and must be updated by behavior.
        // This isn't ungrammatical, but violates the principles of OOP.
        System.out.println("p3의 몸무게: " + p3.weight);
    }
}
