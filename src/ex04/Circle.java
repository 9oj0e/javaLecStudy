package ex04;
// template / blueprint
public class Circle {
    private int radius;
    // 생성자 : 생성되자마자 무조건 실행되는 메서드, 최초값을 세팅하는 기능.
    // 보통 생략되어 보이지 않는 코드. 눈에는 보이지 않지만 자동 생성.
    public Circle(int r){
        radius = r;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }
}
