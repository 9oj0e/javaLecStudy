package ex04;
// ex01
public class DeskLampTest {
    public static void main(String[] args) {
        // use 'new' to create an object.
        DeskLamp myLamp = new DeskLamp();

        // to call a method in an object, use '.'
        myLamp.turnOn();
        System.out.println(myLamp);
        myLamp.turnOff();
        System.out.println(myLamp);
    }
}
