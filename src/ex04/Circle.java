package ex04;
// template / blueprint
public class Circle {
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    } // this.radius refers to
    public Circle(){
        this(0); // ?
    }
    double getArea(){
        return 3.14 * radius * radius;
    }
}
