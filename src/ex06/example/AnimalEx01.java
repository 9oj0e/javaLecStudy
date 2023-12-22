package ex06.example;

class Animal {
    void sound(){ // will be overridden by Cat and Cow
    }
    void run(){
        System.out.println("running..");
    }
}
class Cat extends Animal {
    void sound() { // method redefining
        System.out.println("meow");
    }
}
class Cow extends Animal {
    void sound() { // method redefining
        System.out.println("moo");
    }
}
public class AnimalEx01 {
    public static void main(String[] args) {
        Cat a1 = new Cat(); // dynamic binding
        Cow a2 = new Cow(); // dynamic binding
        a1.sound();
        a1.run();
        a2.sound();
    }
}
