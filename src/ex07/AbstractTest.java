package ex07;

abstract class Shape{
    int x, y;
    public void translate(int x, int y){ // abstract class can have methods.
        this.x = x;
        this.y = y;
    }
    public abstract void draw();
}
class Rectangle extends Shape {
    int width, height;
    @Override
    public void draw() {
        System.out.println("draw Rectangle");
    }
}
class Circle extends Shape {
    int radius;
    @Override
    public void draw() {
        System.out.println("draw Circle");
    }
}

public class AbstractTest {
    public static void main(String[] args) {
//        Shape s = new Shape(); // error. you can create an instance of an abstract class.
        Shape c = new Circle();
        c.draw();
    }

}
