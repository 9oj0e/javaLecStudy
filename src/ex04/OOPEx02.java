package ex04;
// Object-Oriented Programming
class Person4 { // define an object named as "Person3"
    // status
    private int weight = 100; // Private values cannot be accessed by other classes.
    // why do we use private variables? To allow a change to the value only by defined Methods inside the class

    // behavior [Method]
    public void exercise(){
        weight = weight - 10;
    }
    public int getWeight(){
        return weight;
    }
}

public class OOPEx02 {
    public static void main(String[] args) {
        Person4 p4 = new Person4();
        //System.out.println("p4의 몸무게: " + p4.weight); // Private values cannot even be known.
        System.out.println("p4의 몸무게: " + p4.getWeight());
        for (int i = 0; i < 10; i++) {
            p4.exercise();
        }
        System.out.println("p4의 몸무게: " + p4.getWeight());
    }
}
