package ex06;
// ex02
class Shape {
    int x, y;
    public Shape(){
        System.out.println("Shape just created");
    }
}
class Circle extends Shape { // parent: Shape, child: Circle
    int radius;
    public Circle(int radius){
        System.out.println("Circle just created");
        this.radius = radius;
        super.x = 0;
        super.y = 0;
    }
    double getArea() {
        return 3.14 * radius * radius;
    }
}
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
    }
}
