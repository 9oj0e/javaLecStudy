package ex04;
// 4-2
class Box {
    int width;
    int length;
    int height;

    double getVolume() {
        return (double) width * height * length;
    }
}
public class BoxTest{
    public static void main(String[] args) {
        Box b;
        b = new Box();
        b.width = 20;
        b.length = 20;
        b.height = 30;
        System.out.printf("상자의 가로: %d\n상자의 세로: %d\n상자의 높이: %d\n", b.width, b.length, b.height);
        System.out.println("상자의 부피는 " + b.getVolume() + "입니다.");
    }
}
