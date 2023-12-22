package ex06.example4;

public class Dragoon extends Protoss {
    String name;

    public Dragoon(String name) {
        this.name = name;
    }

    public void attack () {
        System.out.println("Dragoon " + name + " attacks");
    }
}
