package ex04;
// ex01
public class DeskLamp {
    // declare an instance variable
    private boolean isOn;

    // declare methods
    public void turnOn(){
        isOn = true;
    }
    public void turnOff() {
        isOn = false;
    }
    public String toString() {
        return "current status : " + (isOn == true ? "ON" : "OFF");
    }
}
