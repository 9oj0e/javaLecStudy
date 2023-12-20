package ex04;
class A{
    private int a;
    int b;
    public int c;
}
public class Test {
    public static void main(String[] args) {
        A obj = new A();
        //obj.a = 10; // only accessed by none but itself
        obj.b = 20; // can be accessed by default members
        obj.c = 30; // can be accessed by public members
    }
}
